import java.util.Date;

public class Student {
    private int id;
    private String code;
    private String name;
    private Date dateOfBirth;
    private int sex; // 0: Nam, 1: Nữ, 2: chưa xác định
    private double avgPoint;

    public Student(int id, String code, String name, Date dateOfBirth, int sex, double avgPoint) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.avgPoint = avgPoint;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSex() {
        return sex;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                ", avgPoint=" + avgPoint +
                '}';
    }
}