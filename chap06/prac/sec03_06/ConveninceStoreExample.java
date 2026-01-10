package chap06.prac.sec03_06;

public class ConveninceStoreExample {
    ConveninceStore p1 = new ConveninceStore("컵라면", 1000);
    ConveninceStore p2 = new ConveninceStore("삼각김밥", 1500);

    System.out.println("상품명: " + p1.name + ", 가격: " + p1.price);
    System.out.println("상품명: " + p2.name + ", 가격: " + p2.price);
}
