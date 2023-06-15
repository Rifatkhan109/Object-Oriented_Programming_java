
package pkgsuper.keyword;

public class Car extends Vehicle{
    int speed = 100;
    
    public void display(){
        super.display();  // Call super for display Vehicle Class Display Function
        System.out.println("\n Car Speed ="+super.speed);
    }
    
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        c1.jim();
    }
    
     void jim(){
        super.display();
        System.out.println("Sajjad Jim");
    }
}
