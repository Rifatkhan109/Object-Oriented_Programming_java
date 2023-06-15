
package arraylist;
import java.util.ArrayList;

public class Arraylist {
    



 
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(19);
        ar.add(40);
        ar.add(30);
       
        System.out.println(ar);
        
        ar.set(1,50);
        ar.remove(1);
        System.out.println(ar);
        
        
        
        
        ArrayList<String>ob=new ArrayList<String>();
        ob.add("volbo");
        ob.add("bmw");
        ob.add("rifat");
        System.out.println(ob);
        
        ob.set(1, "riyad");
        System.out.println(ob);
        System.out.println();
    
}
}

    
