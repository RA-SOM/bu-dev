package chap07.sec02.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2(); //override 된 method 호출
        //parent.method3(); // 호출 불가능. - 형변환에 의한 자동변환 및 객체 접근 불가.
    }
}
