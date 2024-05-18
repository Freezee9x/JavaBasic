import java.util.ArrayList;
import java.util.List;

public class TestString {
    public static void main(String[] args) {

        String text = "The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform. A key element of Spring is infrastructural support at the application level: Spring focuses on the \"plumbing\" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments." ;

        //In chuỗi text ra màn hình
        System.out.println(text);
        //In ra chuỗi con của text, tính từ vị trí 10 đến 20
        System.out.println(text.substring(10,20));
        //Tìm và in ra vị trí chữ "Spring" đầu tiên trong chuỗi text. KQ: 4
        System.out.println(text.indexOf("Spring"));
        //Tìm và in ra vị trí chữ "Spring" cuối cùng trong chuỗi text. KQ: 243
        System.out.println(text.lastIndexOf("Spring"));
        //Kiểm tra xem chuỗi sau có nằm trong chuỗi text không, nếu có thì in "Co nam trong", nếu không nằm trong thì in "Khong nam trong"
        List<String> kt = new ArrayList<String>();
        kt.add("enterprise");
        kt.add("enterprise application");
        kt.add("enterprises");
        for (String i : kt) {
            if (text.contains(i)) {
                System.out.println("Co nam trong" +i);
            } else {
                System.out.println("Khong nam trong" +i);
            }
        }
        //Thay thế chuỗi "Spring Framework" trong chuỗi ký tự text bằng "Spring platform", in ra màn hình kết quả thay thế
        System.out.println(text.replace("Spring Framework","Spring platform"));
        //Biến tất cả chữ trong chuỗi text thành chữ in hoa, in ra màn hình
        System.out.println(text.toUpperCase());
        //Biến tất cả chữ trong chuỗi text thành chữ in thường, in ra màn hình
        System.out.println(text.toLowerCase());
        //Kiểm tra chuỗi text có bắt đầu bởi chuỗi ký tự sau không. In ra màn hình "Có" hoặc "Không"
        List<String> kt1 = new ArrayList<String>();
        kt1.add("the");
        kt1.add("The Spring");
        for (String i : kt1){
            if (text.toLowerCase().startsWith(i.toLowerCase())) {
                System.out.println("Co");
            } else {
                System.out.println("Khong");
            }
        }
        //Cắt chuỗi ký tự text thành các chuỗi phân cách nhau bởi chuỗi "Spring". In ra kết quả sau khi cắt. KQ sẽ là:
        System.out.println(text.replace("Spring","                "));
    }
}
