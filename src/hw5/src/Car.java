import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    CyclicBarrier cb;
    public String getName () {
        return name;
    }
    public int getSpeed () {
        return speed;
    }
    public Car (Race race, int speed, CyclicBarrier cb) {
        this .race = race;
        this .speed = speed;
        this.cb = cb;

        CARS_COUNT++;
        this .name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run () {

        try {
            System.out.println( this .name + " готовится" );
            Thread.sleep( 500 + ( int )(Math.random() * 800 ));
            cb.await();
            System.out.println( this .name + " готов" );
        } catch (Exception e) {
            e.printStackTrace();
        }

        for ( int i = 0 ; i < race.getStages().size(); i++) {
            race.getStages().get(i).go( this );
        }
    }
}
