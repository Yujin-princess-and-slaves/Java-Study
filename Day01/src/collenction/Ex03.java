package collenction;

import java.util.LinkedList;

public class Ex03 {
    public static void main(String[] args) {
        // ArrayList VS LinkedList
        // - 둘 다 List 인터페이스를 상속 받고 있기 때문에 사용법은 동일
        
        // 1. ArrayList : 속도가 빠르다. 단, 수정/제거시 오버헤드 발생
        // 2. LinkedList : 속도가 조금 떨어진다. 수정/제거시 오버헤드 없음

        LinkedList<Double> list = new LinkedList<Double>();
        
        list.add(3.14);
        list.add(6.5);
        list.add(8.123);

        System.out.println("list = " + list);

        System.out.println("\nlist[1] = " + list.get(1));
        
        list.set(2, 10.5);
        list.add(1, 5.568);

        System.out.println("list = " + list);
    }
}
