package advanced.composition;

public class Room {

    private Tv tv;
    private Bed bed;

    public Room(Tv tv, Bed bed) {
        this.tv = tv;
        this.bed = bed;
    }
}
