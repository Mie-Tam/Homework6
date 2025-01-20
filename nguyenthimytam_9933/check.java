
package nguyenthimytam_9933;

import java.util.ArrayList;

public class check {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList();
        city.add("Ho Chi Minh");
        city.add("Da Nang");
        city.add("Ha Noi");
        System.out.println("city hien co" + city);
        String Check = "Đà Nẵng";

        boolean exists = city.contains(Check);

        if (exists) {
            System.out.println("Thanh pho " + Check + " co trong danh sach");
        } else {
            System.out.println("Thanh pho  " + Check + " khong trong danh sach");
        }
    }
}
