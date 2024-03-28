public class Dancer extends Performer {
    private int shoeSize;

    public Dancer(String name, int age, Agent agent, int shoeSize) {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    public void pirouette(int spins) {
        System.out.println("I am spinning " + spins + " times!");
    }
}