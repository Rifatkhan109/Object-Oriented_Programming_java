package super2;

public class Car extends Vehicle {

    private int speed = 100;
    
    public Car() {
       super("Red");
     
    }

    public void display() {
        super.display();
        System.out.println("Vehicle Speed is =" + super.speed);
        System.out.println("Car speed is =" + speed);
    }
    
    
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
       
    }
}
