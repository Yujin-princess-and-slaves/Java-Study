package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // 정수를 입력 받아서 화면에 출력한다
        // - 단, 정수가 아닌 값이 입력 되면 반복을 활용해서 다시 입력 받게 한다
        // 힌트 : 버퍼를 잘 떠올려 보세요

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            try {
                System.out.print("정수 입력 : ");
                n = sc.nextInt();

                break;
            } catch (InputMismatchException e){
                System.err.println("정수가 아닙니다");

                sc.nextLine();
            }
        }

        System.out.println("n = " + n);
        sc.close();
    }
}
