package output;

public class Ex01 {
    public static void main(String[] args) {
        // 1. println()
        System.out.println("Hello");
        System.out.println("World!!!");
        System.out.println();   // = System.out.print("\n");

        // 2. print()
        System.out.print("Hello ");
        System.out.print("World!!!");
        System.out.println();

        // 3. printf()
        System.out.printf("%s씨는 %d분 지각하였다", "이지우", 35);
    }
}
