
package nguyenthimytam_9933;

import java.util.ArrayList;
public class remove {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("hien thi");
        for (int number : list) {
            list.remove(1);
            list.remove(1);
            list.remove(1);
            System.out.println("hien thi"+number);
        }
    }
}


