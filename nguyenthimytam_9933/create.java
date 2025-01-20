
package nguyenthimytam_9933;

import java.util.Scanner;
import java.util.ArrayList;

public class create {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("hien thi");
        for (int number : list) {
            System.out.println(number);
        }
    }
}
