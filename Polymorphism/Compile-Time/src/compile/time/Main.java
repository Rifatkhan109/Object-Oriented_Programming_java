package compile.time;

public class Main {
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        
        System.out.println("1.The result ="+c.add(1, 2));         
        System.out.println("2.The result ="+c.add(2.5, 3.5));    
        System.out.println("3.The result ="+c.add(1, 2, 3));
       
    }
}

