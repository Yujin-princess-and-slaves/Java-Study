package input;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;

        System.out.print("문장 입력 : ");
        str1 = sc.next();

        System.out.println("str1 = " + str1);
        System.out.println();

        sc.nextLine();

        System.out.print("문장 입력(띄어쓰기 가능) : ");
        str2 = sc.nextLine();

        System.out.println("str2 = " + str2);
    }
}
