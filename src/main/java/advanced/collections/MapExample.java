package advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countriesAndCities = new HashMap<>();
        countriesAndCities.put("Poland", "Warsaw");
        countriesAndCities.put("Lithuania", "Vilnius");
        countriesAndCities.put("Latvia", "Riga");
        countriesAndCities.put("Latvia", "Riga2");

        for (Map.Entry<String, String> entry : countriesAndCities.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();
            String value2 = countriesAndCities.get(key);

            System.out.println("Key: " + key);
            System.out.println("Value from getValue(): " + value1);
            System.out.println("Value from get(key): " + value2);
        }

        System.out.println(countriesAndCities.get("Lithuania"));
        countriesAndCities.put("Lithuania", "Kaunas");
        countriesAndCities.put("test", "Kaunas");
        System.out.println(countriesAndCities.get("Lithuania"));
        System.out.println(countriesAndCities.get("test"));
    }
}
