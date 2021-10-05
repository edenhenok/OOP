public class Fish extends Animal {
    private int gills, eyes, fins;

    public Fish(String name, int size, int weight) {
        super(name, 1, size, weight);
        this.gills=gills;
        this.eyes=eyes;
        this.fins=fins;
    }
    private void swim(int speed){
        moveMus();
        moveFin();
        super.move(5); //super.move from Animal
    }
    private void moveMus(){
    }
    private void moveFin(){
    }
}
