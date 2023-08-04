package _abstract;

import other.USB;

import java.security.Key;

class PC{
    void connect(USB usb){
        usb.run();
    }
}

class Memory implements USB{
    @Override
    public void run(){
        System.out.println("메모리 연결. C:\\에 연결됨");
    }
}

class Keyboard implements USB{
    @Override
    public void run(){
        System.out.println("키보드 연결. 장치 드라이버를 설치합니다");
    }
}

class Phone implements USB {
    @Override
    public void run(){
        System.out.println("휴대폰 연결. 갤러리를 오픈");
    }
}
public class Ex03 {
    public static void main(String[] args) {
        PC pc = new PC();

        Memory ram = new Memory();
        Keyboard key = new Keyboard();
        Phone pho = new Phone();

        pc.connect(ram);
        pc.connect(key);
        pc.connect(pho);
    }
}
