package advanced.inheritance.animal_example;

public abstract class Animal {

    protected String voice;
    protected boolean mammal;

    public Animal(String voice, boolean mammal) {
        this.voice = voice;
        this.mammal = mammal;
    }

    public abstract String yieldVoice();

    public void printAnimal() {
        System.out.println(mammal + " " + voice);
    }
}
