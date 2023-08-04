package input;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("데이터를 입력해주세요 : ");
        int data = sc.nextInt();
        System.out.println("당신이 넣은 값은 " + data);

        sc.close();
    }
}
