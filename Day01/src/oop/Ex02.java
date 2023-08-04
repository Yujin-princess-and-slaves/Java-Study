package oop;

public class Ex02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "정홍섭";
        p2.name = "이지우";

        p1.run();
        p2.run();

        p1.eat(p2.name);
        p2.eat(p1.name);
    }
}
