package array;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };

        System.out.println("arr = " + arr);

        // index 꺼내기
        System.out.println("arr[0] = " + arr[0]);
        System.out.println();

        // for문으로 값 조회하기
        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        System.out.println();

        // toString
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
