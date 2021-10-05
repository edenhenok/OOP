public class Car {
    public int doors; //because it's public we can see it in another class
    public int wheels;
    public int seats;
    public String model; // a field
    public String make;
    public String color;

    // you have to do setters and getters inside a class
    public void setModel(String model ){
        //^model is a variable being passed into the setModel
        String validModel = model.toLowerCase();
        if(validModel.equals("elantra")||validModel.equals("bob")) {
            this.model = model; //using this. helps us access the field
        }
        else {
            this.model="Unknown";
        }
            //Set is type=void +  this.field = variable
    }
    public String getModel(){
        return this.model;
        //Get is type =field type + return=the field
    }
}
//}