package home_works.hw_2021_02_20;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RichestMain {

    public static void main(String[] args) {
        List<World> objList = Arrays.asList(
                new Country("Mozambikas", BigDecimal.valueOf(1000)),
                new Country("Brazilija", BigDecimal.valueOf(200)),
                new Person("Saulius", BigDecimal.valueOf(4000)),
                new Person("B. Gates", BigDecimal.valueOf(12))
        );

        World richest = objList.get(0);

        for (int i = 0; i < objList.size() - 1; i++) {
            if (richest.findRicher(objList.get(i + 1).amount)) {
               richest = objList.get(i + 1);
            }
        }

        System.out.println("Richest is: " + richest.name + "  with amount: " + richest.amount);

    }
}
