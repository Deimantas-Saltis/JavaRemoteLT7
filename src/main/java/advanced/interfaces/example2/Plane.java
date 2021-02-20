package advanced.interfaces.example2;

public class Plane extends AirTransport implements Fly {

    public Plane(int speed) {
        super(speed);
    }

    @Override
    public int calculateMaxSpeed() {
        return speed + 50;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}
