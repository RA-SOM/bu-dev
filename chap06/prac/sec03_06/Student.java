package chap06.prac.sec03_06;

public class Student {
    String name;
    static int totalCount = 0;

    public Student(String name) {
        this.name = name;
        totalCount++;
    }

    void displayInfo() {
        System.out.println("학생이름 :  " + this.name);
    }

    void showTotal() {
        System.out.println("총 학생 수 : " + totalCount);
    }
    
}
