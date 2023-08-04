package _static;

// private 속성을 지정해보자
class Human {
    private String name;
    private int age;

    private static int eyes = 2;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo(){
        String result = "%s (%d세, %d개)\n";
        System.out.printf(result, name, age, eyes);
    }

    static int getEyes(){
        // name = "hello";
        // - static 멤버는 일반 멤버를 참조할 수 없다
        // - 인스턴스가 없는 시점에도 정적멤버를 사용할 수 있기 때문
        return eyes;
    }
    static void setEyes(int eyes) {
        // this.eyes = eyes;
        // - static 메서는 this가 존재하지 않음
        Human.eyes = eyes;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("현재 사람의 눈개수 : " + Human.getEyes());

        Human h1 = new Human("엘레강스뽀삐배", 3);
        Human h2 = new Human("짭짤이토마토", 1);
        Human h3 = new Human("매미킴", 17);

        // Human.eyes = 3;
        Human.setEyes(3);

        h1.showInfo();
        h2.showInfo();
        h3.showInfo();
    }
}
