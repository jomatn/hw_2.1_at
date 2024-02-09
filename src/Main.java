public class Main {
    public static void main(String[] args) {
        Scale scale = new Scale(ColorOfScale.GREEN,Firmness.MID_HARD);
        Lizard lizard = new Lizard(12,"Rory", TypeOfFeeding.MEAT, scale);
        System.out.println(lizard.getInfo());


        
        Scale scale1 = new Scale(ColorOfScale.RED,Firmness.HARD);
        Lizard lizard1 = new Lizard(44,"Hawk", TypeOfFeeding.MEAT, scale);
        System.out.println(lizard.getInfo());

    }
}