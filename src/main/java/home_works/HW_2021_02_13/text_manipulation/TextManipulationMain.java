package home_works.HW_2021_02_13.text_manipulation;

public class TextManipulationMain {

    private static final String TEXT = "Ad Astra Per Aspera";

    public static void main(String[] args) {
        System.out.println("Tekstas: " + TEXT);
        System.out.println("Tekstas didžiosiomis raidėmis: " + convertTextToUpperCased());
        System.out.println("Tekstas mažosiomis raidėmis: " + convertTextToLowerCased());
        System.out.println("Tekste A pakeistos į X: " + replaceCapitalATo("X"));
        System.out.println("Ar tekstas prasideda \"Ad\": " + checkPrefixAd("Ad"));
    }

    private static String convertTextToUpperCased() {
        return TEXT.toUpperCase();
    }

    private static String convertTextToLowerCased() {
        return TEXT.toLowerCase();
    }

    private static String replaceCapitalATo(String replacer) {
        return TEXT.replace("A", replacer);
    }

    private static boolean checkPrefixAd(String prefix) {
        return TEXT.startsWith(prefix);
    }
}
