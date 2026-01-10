package chap06.prac.sec03_06;

public class StudentExample {
    public static void main(String[] args) {
        Student str1 = new Student("홍길동");
        Student str2 = new Student("김말동");
        Student str3 = new Student("박길동");

        str1.displayInfo();
        str2.displayInfo();
        str3.displayInfo();

        str1.showTotal();
    }
}
