public class Main {
    //House analogy for a house
    //Class is the blueprint for the house, using the blueprint(plans) we can build as many houses as we like
    //Each HOUSE I build (in other words instantiate using "new" operator) is an OBJECT or an INSTANCE
    //The ADDRESS to the house is the REFRENCE(not the actual house, just the address on a paper)
    //The Refrence can be passeed as PARAMETERS to Constructors and Methods
public static void main(String [] args){

    Car elantra = new Car(); //initialized
    elantra.color= "Yellow";
    //OR
    elantra.setModel("Pink");
    System.out.println("Model is"+elantra.getModel());
//create an animal class
    Animal animal= new Animal("Animal", 1, 1,5);
    // Create a dog
    Dog dog = new Dog("Yorkie", 8,8,21,2,2);
    dog.eat();

}
//Create an animal class


}
