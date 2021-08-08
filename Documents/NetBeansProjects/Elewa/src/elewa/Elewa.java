
package elewa;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Massava
 */
public class Elewa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Map<Character, Integer> map;
        final String str = "a1";
         final String str2 = "a1";

        map = new HashMap<>();  
        // or map = new HashMap<Character, Integer> if you are using something before Java 7.
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
       
           char[] pos = str.toCharArray();
          int x1 = map.get(pos[0]);
          int y1 = Integer.parseInt(Character.toString(pos[1]));
          
          boolean check = (x1 + y1)%2==0;
          
            char[] pos2 = str2.toCharArray();
          int x2 = map.get(pos2[0]);
          int y2 = Integer.parseInt(Character.toString(pos2[1]));
          
          boolean check2  = (x2 + y2)%2==0;
           
           
           
        

        System.out.println(check == check2);
    }
    
}
