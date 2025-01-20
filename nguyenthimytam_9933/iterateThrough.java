
package nguyenthimytam_9933;
import java.util.Scanner;
import java.util.ArrayList;
public class iterateThrough {
    public static void main(String[] args) {
        ArrayList <Double>prices= new ArrayList();
        prices.add(13.45);
        prices.add(14.56);
        prices.add(3.5);
        System.out.println("prices" );
        for ( int i = 0 ; i < prices.size(); i ++){
            System.out.println( prices.get(i));
        }
    
    }
}
