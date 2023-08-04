package oop;

class Person{
    // 1. 필드 : 멤버 변수
    String name;
    int age;

    // 2. 메서드 : 멤버 함수
    void run(){
        System.out.println(this.name + "(이)가 달린다");
        // System.out.println(name + "(이)가 달린다");
    }

    void eat(String name){
        System.out.printf("%s(이)가 %s(을)를 먹는다", this.name, name);
//        System.out.println(name);
        // 지역 변수와 이름이 겹치면, 지역 변수가 우선시된다.
    }
}


public class Ex01 {
    public static void main(String[] args) {
        Person per = new Person();

        per.name = "홍길동";
        per.age = 25;

        System.out.println("per의 이름 : " + per.name);
        System.out.println("per의 나이 : " + per.age);

        per.run();

        per.eat("마르게리따");
    }
}
