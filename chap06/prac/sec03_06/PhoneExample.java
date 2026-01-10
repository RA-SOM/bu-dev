package chap06.prac.sec03_06;

public class PhoneExample {
    public static void main(String[] args) {
        Phone myPhone = new Phone("갤럭시 S24", "실버", 1100000);
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.price);
    }