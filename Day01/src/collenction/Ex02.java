package collenction;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
    public static void main(String[] args) {
        // 리스트의 반복
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("java");
        list.add("C lang");
        list.add("Python");

        System.out.println("list + \"\\n\" = " + list + "\n");

        // 1. 일반 for
        for (int i = 0; i < list.size(); i++){
            System.out.printf("list[%d] = %s\n", i, list.get(i));
        }
        System.out.println();

        // 2. for-each : 요소를 한개씩 왼쪽 변수에 대입하며 반복
        for (String s : list){
            System.out.println("s = " + s);
        }
        System.out.println();

        // 3. iterator : 순환자
        Iterator<String> it = list.iterator();

        while(it.hasNext()){        // hasNext() : 커서를 이동하지 않고 다음 위치에 요소가 있는지 확인
                                    // - 있으면 true, 없으면 false
            String str = it.next(); // next() : 커서를 다음으로 이동 후, 그 위치의 요소를 반환

            System.out.println("str = " + str);
        }
    }
}
