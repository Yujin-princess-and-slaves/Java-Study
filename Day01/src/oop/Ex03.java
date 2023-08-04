package oop;

class Human{
    String name;
    int age;
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(){
        name = "미정";
        age = 1;
    }

    void showInfo(){
        System.out.printf("%s (%d세)\n", name, age);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Human h1 = new Human("홍길동", 23);
        Human h2 = new Human();

        h1.showInfo();
        h2.showInfo();

    }
}
