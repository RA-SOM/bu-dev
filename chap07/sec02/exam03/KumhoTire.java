package chap07.sec02.exam03;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        // TODO Auto-generated method stub
        ++accmulatedRoation;
        if(accmulatedRoation<maxRotation) {
            System.out.println(location + "KumhoTire 수명: " + (maxRotation-accmulatedRoation) + "회");
            return true;
        } else {
            System.out.println("***" + location + "KumhoTire 펑크 ***");
            return false;
        }
    }
}
