import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            students.add(new Student(1, "705301001", "Đặng Thị Lan Anh", sdf.parse("30/12/2002"), 1, 4.5));
            students.add(new Student(2, "705301002", "Trần Xuân Sơn", sdf.parse("23/09/2002"), 0, 3.8));
            students.add(new Student(3, "705301003", "Lê Đức Mạnh", sdf.parse("10/06/2002"), 1, 4.6));
            students.add(new Student(4, "705301004", "Bùi Thị Mai Hương", sdf.parse("22/08/2002"), 1, 3.5));
            students.add(new Student(5, "705301005", "Đặng Thị Thu Hương", sdf.parse("13/01/2002"), 1, 3.2));
            students.add(new Student(6, "705301006", "Nguyễn Khánh Hùng", sdf.parse("04/06/2001"), 0, 4.1));
            students.add(new Student(7, "705301007", "Trần Viết Cao Cường", sdf.parse("16/02/2001"), 0, 3.1));
            students.add(new Student(8, "705301008", "Đặng Viết Bình", sdf.parse("30/12/2001"), 0, 3.2));
            students.add(new Student(9, "705301009", "Hoàng Thị Hà Giang", sdf.parse("03/08/2002"), 1, 4.9));
            students.add(new Student(10, "705301010", "An Thị Hồng Ngát", sdf.parse("09/01/2002"), 1, 3.0));
            students.add(new Student(11, "705301011", "Nguyễn Thị Phương Chi", sdf.parse("30/09/2002"), 1, 2.7));
            students.add(new Student(12, "705301012", "Bùi Quốc Bảo", sdf.parse("25/01/2002"), 0, 3.9));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // In danh sách sinh viên
        students.forEach(System.out::println);

        // 3. Sử dụng StreamAPI đếm và in ra màn hình
        System.out.println("Tổng số sinh viên: " + students.size());
        long totalMale = students.stream().filter(student -> student.getSex() == 0).count();
        System.out.println("Tổng số sinh viên nam: " + totalMale);
        long totalFemale = students.stream().filter(student -> student.getSex() == 1).count();
        System.out.println("Tổng số sinh viên nữ: " + totalFemale);

        // 4. Sử dụng StreamAPI sắp xếp và in ra màn hình
        System.out.println("Sắp xếp theo tên ABC tăng dần:");
        students.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);

        System.out.println("Sắp xếp theo điểm tốt nghiệp từ cao xuống thấp:");
        students.stream().sorted((s1, s2) -> Double.compare(s2.getAvgPoint(), s1.getAvgPoint())).forEach(System.out::println);

        System.out.println("Sắp xếp theo ngày sinh người nhiều tuổi nhất xếp trên đầu:");
        students.stream().sorted((s1, s2) -> s1.getDateOfBirth().compareTo(s2.getDateOfBirth())).forEach(System.out::println);

        System.out.println("Sắp xếp theo giới tính nữ lên trước nam ở dưới, trong từng nhóm sắp xếp theo tên ABC:");
        students.stream()
                .sorted((s1, s2) -> {
                    if (s1.getSex() != s2.getSex()) {
                        return Integer.compare(s1.getSex(), s2.getSex());
                    } else {
                        return s1.getName().compareTo(s2.getName());
                    }
                })
                .forEach(System.out::println);

        // 5. Sử dụng Stream API tính điểm tốt nghiệp trung bình và in ra màn hình
        double avgPointAll = students.stream().mapToDouble(Student::getAvgPoint).average().orElse(0.0);
        System.out.println("Điểm trung bình chung cả lớp: " + avgPointAll);

        double avgPointFemale = students.stream().filter(student -> student.getSex() == 1).mapToDouble(Student::getAvgPoint).average().orElse(0.0);
        System.out.println("Điểm trung bình chung của các bạn nữ: " + avgPointFemale);

        double avgPointMale = students.stream().filter(student -> student.getSex() == 0).mapToDouble(Student::getAvgPoint).average().orElse(0.0);
        System.out.println("Điểm trung bình chung của các bạn nam: " + avgPointMale);

        // 6. Sử dụng StreamAPI tạo danh sách mới chỉ bao gồm họ và tên của các sinh viên
        System.out.println("Danh sách họ và tên của các sinh viên:");
        students.stream().map(Student::getName).forEach(System.out::println);

        // 7. Sử dụng StreamAPI tạo danh sách mới chỉ bao gồm tên của các sinh viên, loại bỏ trùng lặp
        System.out.println("Danh sách tên không trùng nhau của các sinh viên:");
        students.stream().map(student -> student.getName().split(" ")[student.getName().split(" ").length - 1])
                .distinct().forEach(System.out::println);

        // 8. Sử dụng StreamAPI tạo danh sách mới chỉ bao gồm ngày sinh của các sinh viên, sắp xếp từ nhỏ đến lớn
        System.out.println("Danh sách ngày sinh của các sinh viên, sắp xếp từ nhỏ đến lớn:");
        students.stream().map(Student::getDateOfBirth).sorted().forEach(date -> System.out.println(sdf.format(date)));
    }
}
