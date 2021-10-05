public class Animal {
    private String name;
    private int brain;
    private int size;
    private int weight;
    public void eat(){
        System.out.println();
    }
    public void move(int speed){
        System.out.println("moving");
    }
    public Animal(String name, int brain, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }


}

