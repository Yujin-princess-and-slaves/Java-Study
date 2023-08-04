package _switch;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;

        System.out.println("---------- 메뉴 ----------");
        System.out.println("\t 1. 등심까스");
        System.out.println("\t 2. 치차론");
        System.out.println("\t 3. 마르게리따");

        System.out.print(">>> ");
        menu = sc.next();

        switch (menu){
            case "등심까스":
                System.out.println("등심까스 주문");
                break;
            case "치차론":
                System.out.println("치차론 주문");
                break;
            case "마르게리따":
                System.out.println("재고X 하와이안 피자 주문");
                break;
            default:
                System.out.println("아야~ 메뉴에 없어용");
        }

        sc.close();
    }
}
