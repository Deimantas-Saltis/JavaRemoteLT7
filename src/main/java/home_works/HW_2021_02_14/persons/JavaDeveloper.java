package home_works.HW_2021_02_14.persons;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, int ageOfExperience) {
        super(name, ageOfExperience);
        System.out.println(JavaDeveloper.class.getSimpleName() + " constructor is called");
    }

    @Override
    public String textInCapital(String surname) {
       return super.textInCapital(String.format("%s %s", name, surname));
    }
}
