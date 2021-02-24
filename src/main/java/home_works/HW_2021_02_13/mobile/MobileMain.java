package home_works.HW_2021_02_13.mobile;

/*
Sukurti objektą `Mobile`, su laukais: `model`, `manufacturer`, `price`
    * Inicializuoti 3 `Mobile` objektus;
    * Atrasti brangiausią įrenginį ir atspausdinti jo modelį ir gamintoją.
* */
public class MobileMain {

    public static void main(String[] args) {
        Mobile[] mobiles = buildMobileArr();

        Mobile mostExpensive = getMostExpensiveMobile(mobiles);
        System.out.println(mostExpensive);
    }

    public static Mobile getMostExpensiveMobile(Mobile[] mobiles) {
        Mobile mostExpensive = mobiles[0];

        for (Mobile m : mobiles) {
            if (mostExpensive.getPrice() < m.getPrice()) {
                mostExpensive = m;
            }
        }

        return mostExpensive;
    }

    private static Mobile[] buildMobileArr() {
        return new Mobile[]{
                new Mobile("3310", "Nokia", 150),
                new Mobile("X10", "Sony", 500),
                new Mobile("11", "iPhone", 1700)
        };
    }
}
