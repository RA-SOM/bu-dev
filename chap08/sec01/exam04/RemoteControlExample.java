package chap08.sec01.exam04;

import chap08.sec01.exam03.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        
        rc = new Television();
        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
