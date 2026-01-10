package chap06.prac.sec03_06;

public class CompanyExample {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        
        if (c1 == c2) {
            System.out.println("일치함.");
        } else {
            System.out.println("다름");
        }
    }
}