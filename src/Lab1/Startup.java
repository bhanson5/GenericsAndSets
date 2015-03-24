
package Lab1;

/**
 *
 * @author bhanson5
 */
import java.util.*;

public class Startup {
    
    public static void main(String[] args) {
        
        List<String> hobbyItemList = new ArrayList<>();
        
        hobbyItemList.add("Gaming");
        hobbyItemList.add("Eating");
        hobbyItemList.add("Sleeping");
        
        for (String list : hobbyItemList) {
            System.out.println(list);
        }
        
        System.out.println("");
        hobbyItemList.add("Shitting");
        
        for (String list : hobbyItemList) {
            System.out.println(list);
        }
        
        hobbyItemList.remove("Shitting");
        System.out.println("");
        
        for (String list : hobbyItemList) {
            System.out.println(list);
        }
    }
    
}
