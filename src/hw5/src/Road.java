
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Road extends Stage {
    private int racerCount = 1;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock writeLock = readWriteLock.writeLock();
    private final Lock readLock = readWriteLock.readLock();

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);

            if (this.length == 40) {
                writeLock.lock();
                readLock.lock();
//                semaphore.acquire();
                System.out.println(c.getName() + " закончил этап: " + description);
                if (racerCount == 1) { // <-----------------------
                    System.out.println(c.getName() + " WINNER!");
                }
                    racerCount++;

                if(racerCount == 5){
                    System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!" );
                }
                writeLock.unlock();
                readLock.unlock();
//                semaphore.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
