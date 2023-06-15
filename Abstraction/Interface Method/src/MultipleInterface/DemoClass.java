
package MultipleInterface;

public class DemoClass implements FirstIF,SecondIF {
    public void MyMethod(){
        System.out.println(" This is First Interface Method ");
    } 
    public void otherMethod(){
        System.out.println(" This is second Interface Method ");
    }
}
