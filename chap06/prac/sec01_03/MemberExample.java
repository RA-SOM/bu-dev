package chap06.prac.sec01_03;

public class MemberExample {
    public static void main(String[] args) {
    Member member = new Member();
    member.name = "최하얀";
    member.age = 23;

     System.out.println("이름: " + member.name + ", ID: " + member.id + ", PW: " + member.password + ", 나이: " + member.age);
    }
}
