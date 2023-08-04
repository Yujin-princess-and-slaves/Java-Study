package method;

public class Ex04 {
    /*
    * 메서드의 종류
    * 1. 반환값 o 메서드 : 자료형 메서드. void가 아닌 모든 메서드
    * 2. 반환값 x 메서드 : void 메서드
    *
    * 반환 : return
    * - 값을 돌려준다.
    * - 즉, 메서드의 실행 결과값을 의미
    *
    */

    // void형 메서드 : 내부코드를 실행만 한다
    static void adder1(int n1, int n2){
        int sum = n1 + n2;
        System.out.printf("%d + %d = %d\n", n1, n2, sum);
    }

    // int형 메서드 : 코드를 실행 후 정수의 결과를 돌려준다
    static int adder2(int n1, int n2){
        int sum = n1 + n2;

        return sum;     // return : 메서드 즉시 종료
//        System.out.println("done!");      이미 종료되었기 때문에 실행될 수 없다.
    }

    public static void main(String[] args) {
        adder1(5, 6);

        int sum = adder2(5, 6);     // 1. 변수에 결과를 저장해서 사용하거나

        System.out.println("adder2(7, 1) = " + adder2(7, 1) + "\n");     // 다른 메서드의 전달값으로 바로 사용한다


    }
}
