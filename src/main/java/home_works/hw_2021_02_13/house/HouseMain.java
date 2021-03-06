package home_works.hw_2021_02_13.house;

public class HouseMain {

    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House(20.2, "", 5, "");
    }

    public static House getNewestHouse(House[] houses) {
        House newestHouse = houses[0];

        for (int i = 0; i < houses.length; i++) {
            if (newestHouse.getBuiltYear() < houses[i].getBuiltYear()) {
                newestHouse = houses[i];
            }
        }
        return newestHouse;
    }

    public static int getNumberOfFittedHouses(House[] houses) {
        int fittedHousesCounter = 0;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getCondition().equals("fitted")) {
                fittedHousesCounter++;
            }
        }
        return fittedHousesCounter;
    }

    public static House getSmallestHouses(House[] houses) {
        House smallestHouse = houses[0];

        for (int i = 0; i < houses.length; i++) {
            if (smallestHouse.getHouseArea() > houses[i].getHouseArea()) {
                smallestHouse = houses[i];
            }
        }
        return smallestHouse;
    }
}
