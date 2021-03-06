package home_works.hw_2021_02_13.dog;

public class DogMain {
    /*
    Susikurti objektą "Dog", su laukais: "name", "age", "color"
    * Inicializuoti 3 "Dog" objektus;
    * Objektai turi būti saugojami masyve;
    * Sukurti metodą vyriausio šuns radimui ir jo vardo išspausdinimui;
    * Sukurti metodą šunų vidutiniam amžiui rasti.
    * */
    public static void main(String[] args) {
        Dog[] dogList = buildDogArray();

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));
    }

    private static String findOldestDog(Dog[] dogList) {
        String oldestDogName = dogList[0].getName();
        int oldestDog = dogList[0].getAge();

        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }

        return oldestDogName;
    }

    private static double findAverageYearOfDogs(Dog[] dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }

        return averageYear / dogList.length;
    }

    private static Dog[] buildDogArray() {
        return new Dog[]{
                new Dog("Beke",14,"cinamon"),
                new Dog("Gogo",2,"black"),
                new Dog("Lila",5,"brown")
        };
    }
}
