package chap06.prac.sec03_06.singleTone;

public class Company {
    // 입력 필드
    private static Company instance = new Company();

    // 생성자
    private Company() {
    }

    // 정적 메소드
    public static Company getInstance() {
        return instance;
    }
}
