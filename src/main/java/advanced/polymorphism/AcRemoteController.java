package advanced.polymorphism;

public class AcRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air conditioning ON");
    }
}
