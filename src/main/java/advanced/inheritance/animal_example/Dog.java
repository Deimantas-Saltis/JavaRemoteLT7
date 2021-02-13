package advanced.inheritance.animal_example;

public class Dog extends Animal{

    private String breed;

    public Dog(String breed, String voice, boolean mammal) {
        super(voice, mammal);
        this.breed = breed;
    }

    @Override
    public String yieldVoice() {
        return "Dog voice: " + voice;
    }
}
