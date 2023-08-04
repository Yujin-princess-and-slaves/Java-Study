package array;

public class Ex03 {
    public static void main(String[] args) {
        int[][] arr2 = new int[][]{
                {10, 20, 30, 40, 50},
                {11, 21, 31, 41, 51},
                {12, 22, 32, 42, 52}
        };
        // 실제 메모리
        //  arr2 = new int[][] { { 10,20,30,40 }, { 11,21,31,41 }, { 12,22,32,42 } };
        System.out.println("arr2[0][0] = " + arr2[0][0]);
    }

}
