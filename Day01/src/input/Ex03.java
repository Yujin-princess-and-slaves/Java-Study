package input;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("두 정수 입력 : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("n1 = " + n1 + " n2 = " + n2);

        sc.nextLine();


        System.out.print("다시 두 정수 입력 : ");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println("n3 = " + n3 + " n4 = " + n4);

        sc.close();
    }
}
