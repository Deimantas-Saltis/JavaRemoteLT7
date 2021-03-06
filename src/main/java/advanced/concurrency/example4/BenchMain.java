package advanced.concurrency.example4;

public class BenchMain {

    public static void main(String[] args) {
        Bench bench = new Bench(1);

        SeatTakerThread STT1 = new SeatTakerThread(bench);
        SeatTakerThread STT2 = new SeatTakerThread(bench);
        SeatTakerThread STT3 = new SeatTakerThread(bench);
        SeatTakerThread STT4 = new SeatTakerThread(bench);
        SeatTakerThread STT5 = new SeatTakerThread(bench);
        SeatTakerThread STT6 = new SeatTakerThread(bench);
        SeatTakerThread STT7 = new SeatTakerThread(bench);
        SeatTakerThread STT8 = new SeatTakerThread(bench);
        SeatTakerThread STT9 = new SeatTakerThread(bench);
        SeatTakerThread STT10 = new SeatTakerThread(bench);
        SeatTakerThread STT11 = new SeatTakerThread(bench);

        STT1.start();
        STT2.start();
        STT3.start();
        STT4.start();
        STT5.start();
        STT6.start();
        STT7.start();
        STT8.start();
        STT9.start();
        STT10.start();
        STT11.start();
    }
}
