
package super2;

public class Vehicle {
    protected int speed = 50 ;
    
    public Vehicle(String colour){
        
        System.out.println("\nvehicle is create with Colour ="+colour);
    }
    
    public void display(){
        System.out.println("\nVehicle Speed ="+speed);
    }
}
