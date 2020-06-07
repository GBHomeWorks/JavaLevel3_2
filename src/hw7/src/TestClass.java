import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestClass {

    private SortedSet<Method> sortedSet = new TreeSet<>();

    public TestClass() {
        this.sortedSet = new TreeSet<>(new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                int o1Priority = 0;
                int o2Priority = 0;

                if (o1.getAnnotation(annotation.BeforeSuite.class) != null){
                    o1Priority = 0;
                }else if(o1.getAnnotation(annotation.AfterSuite.class) != null){
                    o1Priority = 11;
                }else {
                    o1Priority = o1.getAnnotation(annotation.Test.class).priority();
                }

                if (o2.getAnnotation(annotation.BeforeSuite.class) != null){
                    o2Priority = 0;
                }else if(o2.getAnnotation(annotation.AfterSuite.class) != null){
                    o2Priority = 11;
                }else {
                    o2Priority = o2.getAnnotation(annotation.Test.class).priority();
                }
                return o1Priority == o2Priority ? 1 : o1Priority - o2Priority;
            }
        });
    }


    public void start(Class testClass) {
        int countAfter = 0;
        int countAfter = 0;
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getDeclaredAnnotation(annotation.BeforeSuite.class) != null) {
                if (countAfter < 1) {
                    sortedSet.add(method);
                    countAfter++;
                } else {
                    throw new RuntimeException("Annotations BeforeSuite more then one");
                }
            }
            if (method.getDeclaredAnnotation(annotation.AfterSuite.class) != null) {
                if (countAfter < 1) {
                    sortedSet.add(method);
                    countAfter++;
                } else {
                    throw new RuntimeException("Annotations AfterSuite are more then one");
                }
            }
        /*if (method.getDeclaredAnnotation(ru.gb.annotation.AfterSuite.class) != null){
            if(countAfter < 1){
                sortedSet.add(method);
                countAfter++;
            }else {
                throw new RuntimeException("Annotations AfterSuite more then one");
            }
        }*/
            if (method.getDeclaredAnnotation(annotation.Test.class) != null) {
                int priority = method.getDeclaredAnnotation(annotation.Test.class).priority();
                if (priority >= 1 && priority <= 10) {
                    sortedSet.add(method);
                } else {
                    throw new RuntimeException("Uncorrected method priority" + method.getName());
                }
            }
        }
        for (Method metthod : sortedSet) {
            try {
                Object obj = testClass.newInstance();
                method.invoke(obj);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new TestClass().start(ExampleClass.class);
    }
}

