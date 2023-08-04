package method;

public class Quiz {
    static void printNumber(int n){
        for(int i = 1; i <= n; i++){
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    static int total(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    static double circle(double r){
        return 3.14 * r * r;
    }

    static int maxArr(int[] arr){
        int max = 0;

        /*
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
        */

        for(int i : arr){
            max = i > max ? i : max;
        }

        return max;
    }

    public static void main(String[] args) {
        // 아래 코드가 실행되게 작성하세요
        // 1. 1 ~ n까지 일렬로 출력하는 메서드
        printNumber(5);     // 1 2 3 4 5
        printNumber(3);     // 1 2 3

        // 2. 1 ~ n까지의 합계를 반환하는 메서드
        int sum = total(5);

        System.out.println("\nsum = " + sum);
        System.out.println("total(3) = " + total(3));

        // 3. 실수 하나(반지름)을 전달하면 원넓이를 반환
        // 단, 원주율은 3.14로 계산한다.
        double width = circle(3.9);

        System.out.println("\nwidth = " + width);
        System.out.println("circle(5.1) = " + circle(5.1));

        // 4. 전달한 배열에서 최대값을 반환
        int[] arr = new int[] { 70, 60, 80, 50, 40, 77 };

        System.out.println("\nmaxArr(arr) = " + maxArr(arr));
    }
}
