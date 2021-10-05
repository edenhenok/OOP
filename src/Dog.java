public class Dog extends Animal{
 // fields specific to this class goes here as private
    private int eyes;
    private int legs; //not all animals have legs but dogs have legs
    private int tail;


   // public Dog(String name, int brain, int size, int weight) {
    //    super(name, brain, size, weight);
    //}
    public Dog(String name, int size, int weight,int eyes,int legs, int tail) {
        super(name, 1, size, weight);
        this.eyes =eyes;
        this.legs=legs;
        this.tail=tail;

    }

}
