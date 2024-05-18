import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        java.util.List<String> fruitList = new ArrayList<String>();
        fruitList.add("orange");
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("watermelon");
        fruitList.add("grape");
        fruitList.add("starfruit");
        fruitList.add("mango");
        //In ra màn hình danh sách trên
        System.out.println(fruitList);
        //Thêm 1 chuỗi ký tự "lemon" vào danh sách trên, in ra màn hình danh sách
        fruitList.add("lemon");
        System.out.println(fruitList);

        //Thêm 2 chuỗi ký tự "pineapple", "coconut" vào danh sách trên, in ra màn hình danh sách
        fruitList.add("pineapple, coconut");
        System.out.println(fruitList);

        //Thêm 1 chuỗi ký tự "plum" vào vị trí đầu tiên trong danh sách trên, in ra màn hình danh sách
        fruitList.add(0, "plum");
        System.out.println(fruitList);
        //Kiểm tra trong danh sách có chuỗi ký tự sau không. In ra "Có <chuỗi nhập vào" hoặc "Không có <chuỗi nhập vào>"
        List<String> kt = new ArrayList<String>();
        kt.add("apricot");
        kt.add("star fruit");
        kt.add("banana,mango");
        for (String i : kt) {
            if (fruitList.contains(i)) {
                System.out.println("Co nam trong " + i);
            } else {
                System.out.println("Khong nam trong " + i);
            }
        }
        //In ra màn hình chuỗi ở vị trí thứ 5 trong danh sách
        System.out.println(fruitList.get(4));
        //Tìm và in ra vị trí chuỗi "lemon" trong danh sách
        System.out.println(fruitList.indexOf("lemon"));
        //Xóa chuỗi "grape" khỏi danh sách, in ra danh sách kết quả
        fruitList.remove("grape");
        System.out.println(fruitList);
        //Thay đổi chuỗi thứ 3 trong danh sách thành "kiwi", in ra kết quả
        fruitList.set(2, "kiwi");
        System.out.println(fruitList);
        //Sắp xếp danh sách theo thứ tự ABC tăng dần, in ra kết quả
        Collections.sort(fruitList, Collections.reverseOrder());
        System.out.println(fruitList);
        //Sắp xếp danh sách theo thứ tự ABC giảm dần, in ra kết quả
        Collections.sort(fruitList);
        System.out.println(fruitList);
        //Sắp xếp danh sách theo thứ tự ABC tăng dần, sau đó in ra 3 chuỗi ký tự đầu tiên trong danh sách đã sắp xếp
        Collections.sort(fruitList, Collections.reverseOrder());
        for (int i = 0; i<Math.min(3,fruitList.size());i++)
        System.out.println(fruitList.get(i));
    }
}