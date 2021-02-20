package advanced.enumerators;

public enum CarMaker {
    BMW("bymer", 1850),
    VOLVO("volvo", 2020),
    MB("mercedes-benz", 1920);

    final String fullName;
    final int establishedIn;

    CarMaker(String fullName, int establishedIn) {
        this.fullName = fullName;
        this.establishedIn = establishedIn;
    }
}
