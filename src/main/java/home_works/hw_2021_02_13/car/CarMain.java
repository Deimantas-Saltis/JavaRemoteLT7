package home_works.hw_2021_02_13.car;

public class CarMain {

    public static void main(String[] args) {
        Car[] carArr = buildCarArray();

        System.out.println("Naujausias automobilis: " + findNewestCar(carArr));
        System.out.println("Vidutinis automobilių amžius: " + findAverageCarsYear(carArr));
        System.out.println("Brangiausias automobilis: " + findMostExpensiveCar(carArr));
    }

    private static String findNewestCar(Car[] carList) {
        int newestCarMadeIn = carList[0].getYear();
        for (Car car : carList) {
            newestCarMadeIn = Math.max(newestCarMadeIn, car.getYear());
        }

        return String.valueOf(newestCarMadeIn);
    }

    private static double findAverageCarsYear(Car[] carList) {
        int carsYearSum = 0;

        for (Car car : carList) {
            carsYearSum += car.getYear();
        }

        return (double) carsYearSum / carList.length;
    }

    private static double findMostExpensiveCar(Car[] carList) {
        double mostExpensiveCar = carList[0].getPrice();
        for (Car car : carList) {
            mostExpensiveCar = Math.max(mostExpensiveCar, car.getPrice());
        }

        return mostExpensiveCar;
    }

    private static Car[] buildCarArray() {
        return new Car[]{
                new Car("audi", 2, 2006, 43000, "sedan"),
                new Car("bmw", 3, 2008, 31122, "touring"),
                new Car("toyota", 1, 2014, 23543, "sedan")
        };
    }
}
