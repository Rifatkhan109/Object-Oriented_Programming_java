
package abstraction.pkg2;


public class Triangle extends Shape{
    
    Triangle(double a,double b){
        super(a,b);
    }
    
    void area(){
        double result= 0.5 *a*b ;
        System.out.println("area :"+result);
    }
    
}
