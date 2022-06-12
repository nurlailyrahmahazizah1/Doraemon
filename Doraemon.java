
package doraemon;
import java.util.ArrayList;
public class Doraemon {
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();
                
            kantongAjaib.add("Pintu ke masa depan"); //index 0
            kantongAjaib.add("bersama"); //index 1
            kantongAjaib.add("norr"); //2
            kantongAjaib.add(true); //3
            kantongAjaib.add("mantan"); //4 
            kantongAjaib.remove("kucing");
            kantongAjaib.set(3,false);
            kantongAjaib.set(1, "sendiri");
               
           // System.out.println(kantongAjaib);
           // System.out.println(kantongAjaib.size());
           // System.out.println(kantongAjaib.get(2));
        
        String nama[]={"nur","laily","rahmah","azizah"} ; 
        System.out.println(nama[1]);
        try{
        System.out.println(nama[4]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("index array melebihi batas");
        }
        System.out.println(nama[0]);
        
    }
    
}
