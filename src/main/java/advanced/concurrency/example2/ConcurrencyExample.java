package advanced.concurrency.example2;

public class ConcurrencyExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts!");

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        try {
            Thread.sleep(2000);
            System.out.println("Main thread is still running");

            Thread.sleep(3000);
            System.out.println("Main thread ends :/ ");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted on sleep");
        }
    }
}
