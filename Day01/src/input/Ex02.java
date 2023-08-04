package input;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("이름을 입력하세요 : ");
        name = sc.next();

        System.out.println("당신의 이름은 " + name + "입니다");

        // 문자열은 문자가 나열된 배열이다.
        // - 하나만 가져올 수 있다.
        System.out.println("당신의 성은 " + name.charAt(0) + "씨 입니다");

        // 문자 하나만 받고 싶을 때
        char ch;
        System.out.print("\n문자를 입력하세요 : ");
        ch = sc.next().charAt(0);

        sc.close();
    }
}
