package collenction;

import java.util.HashMap;
import java.util.Set;

public class Ex06 {
    public static void main(String[] args) {
        // Map : Key와 Value의 한쌍의 자료구조
        // - key는 value에 접근하기 위한 index 역할
        // - value는 실제로 저장하려는 데이터
        // - key는 중복x, value는 중복o

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("Java", 70);
        map.put("Python", 85);
        map.put("C", 0);

        System.out.println("map = " + map);

        System.out.println("\nmap['Java'] = " + map.get("Java"));
        System.out.println("map['C'] = " + map.get("C") + "\n");
        // 즉, key는 list의 index의 역할과 동일하며 개발자가 원하는 커스텀 index이다 
        // 사람은 주로 글자가 익숙한 타입이므로 key는 String이 주로 사용된다 
        
        // map은 반복/순환이 불가능
        // - key를 뽑아서 순환 가능
        
        Set<String> keys = map.keySet();

        System.out.println("keys = " + keys);

        for(String k : keys){
            System.out.println(k + " : " + map.get(k));
        }
    }
}
