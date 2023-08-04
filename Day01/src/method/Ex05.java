package method;

public class Ex05 {
    /*
     * 메서드 오버로딩 (method overloading)
     * - 같은 이름의 메서드를 여러개 작성하는 방식
     *
     * 작성 규칙)
     * 1. 메서드들의 이름이 같아야 한다
     * 2. 매개변수의 형태가 달라야 한다
     * 3. 반환형은 오버로딩에 무관
     *
     */

    static int adder(int n1, int n2){
        return n1 + n2;
    }

    static int adder(int n1){
        return 100 + n1;
    }

    static double adder(double d1){
        return 3.14 + d1;
    }

    public static void main(String[] args) {
        System.out.println("결과 : " + adder(5, 6));
        System.out.println("결과 : " + adder(5));
        System.out.println("결과 : " + adder(5.0));
    }
}
