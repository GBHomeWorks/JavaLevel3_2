import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainClass {
    public static final int CARS_COUNT = 4 ;
    public static void main (String[] args) {
        CyclicBarrier cb = new CyclicBarrier( CARS_COUNT );

        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!" );
        Race race = new Race( new Road( 60 ), new Tunnel(), new Road( 40 ));
        Car[] cars = new Car[CARS_COUNT];
        for ( int i = 0 ; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + ( int ) (Math.random() * 10 ), cb);
        }
        for ( int i = 0 ; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!" );
    }
}
