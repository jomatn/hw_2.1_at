public class Lizard extends Scaly{
    private int age;
    private String name;
    private TypeOfFeeding feedingType;

    public Lizard(int age, String name, TypeOfFeeding feedingType, Scale scale) {
        super(scale);
        this.age = age;
        this.name = name;
        this.feedingType = feedingType;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public TypeOfFeeding getFeedingType() {
        return feedingType;
    }

    public String getInfo() {
        return "Lizard Info: " +
                "\nName: " + name +
                "\n Age: " + age +
                "\n Feeding Type: " + feedingType +
                "\n Scale Color: " + getScale().getColorOfScale() +
                "\n Scale Firmness: " + getScale().getFirmness();
    }
}
