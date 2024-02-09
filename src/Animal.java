import java.util.Random;

public class Animal {
    private int age = generateDefaultAge();
    private String name;
    TypeOfFeeding typeOfFeeding;

    public Animal() {
        this.name = this.name;
        this.age = this.age;
        this.typeOfFeeding = this.typeOfFeeding;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public TypeOfFeeding getTypeOfFeeding() {
        return typeOfFeeding;
    }
    private  int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(31)+1;

    }
    protected String getInfo() {
        return  "\nAge:" + age+
                "\nName:" + name+
                "\nFood:" + typeOfFeeding;
    }
}
