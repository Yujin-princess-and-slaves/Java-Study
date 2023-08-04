package variable;

public class Ex02 {
    public static void main(String[] args) {
        // 자동 형변환
        // 순서
        // 정수 -> 실수 -> 문자열

        System.out.println("10" + 20);  // System.out.println("10" + (String)20);

        System.out.println(10 + 3.14);  // System.out.println(10.0 + 3.14);
    }
}
