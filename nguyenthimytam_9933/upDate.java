
package nguyenthimytam_9933;

import java.util.Scanner;
import java.util.ArrayList;

public class upDate {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("yellow");
        color.add("Blue");
        color.add("Black");
        color.add("Red");
        color.add("Green");
        System.out.println("hien thi mau " + color + " ");

        color.set(2, "Yellow");
        System.out.println("hien thi sau khi thay doi" + color + "");
    }
}
