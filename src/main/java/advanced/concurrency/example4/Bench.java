package advanced.concurrency.example4;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("There are no seats available :/ ");
        }
    }

    public synchronized void takeASeatSync() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("There are no seats available :/ ");
        }
    }

    public void takeASeatSyncBlock() {
        System.out.println("Unsynced part!");

        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat");
                availableSeats--;
                System.out.println("Available seats: " + availableSeats);
            } else {
                System.out.println("There are no seats available :/ ");
            }
        }
    }
}
