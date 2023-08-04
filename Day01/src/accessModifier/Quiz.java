package accessModifier;

import other.Po;

public class Quiz {
    public static void main(String[] args) {
        // 아래 코드가 동작하게 클래스를 구현
        // 단, other 패키지 안에 클래스를 생성할 것
        // 또, 필드는 모두 private처리, 메서드는 public으로 처리한다

        Po p1 = new Po(5, 3);       // 필드 x, y(= 정수)
        Po p2 = new Po(7, 1);

        p1.showPo();    // (5, 3)
        p2.showPo();    // (7, 1)

        Po p3 = p1.addPo(p2);   // p1 + p2

        p3.showPo();

    }
}
