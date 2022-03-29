package xyz.company;


class Pen {
    //properties of class pen
    String color;
    String type;

    // Functions /methods of pen
    public void write () {
        System.out.println("Writing");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
//Creating object.Objects are created in main method
public class OOPS {
    public static void main(String[] args) {
        Pen pen1= new Pen();

        //Accessing the properties
        pen1.color ="blue";
        pen1.type= "Gel";

        Pen pen2= new Pen();
        pen2.color= "black";
        pen2.type= "Ballpoint";

        //Accessing methods
        pen1.write();
        pen1.printColor();
        pen1.printType();


        pen2.printType();
        pen2.printColor();
    }
}
