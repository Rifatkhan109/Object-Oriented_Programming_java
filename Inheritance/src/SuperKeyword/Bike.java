package pkgsuper.keyword;

public class Bike extends Vehicle{
int speed = 100;

public void display(){
    super.display();
    System.out.println("Speed ="+super.speed);  // System.out.println(speed);
}
    public static void main(String[] args) {
        Bike b1 = new Bike();
        
        b1.display();
    }
}

