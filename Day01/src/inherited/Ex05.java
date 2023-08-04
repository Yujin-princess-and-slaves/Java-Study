package inherited;

import other.Person;

public class Ex05 {
    public static void main(String[] args) {
        // ※ 배열에는 참조 변수를 작성해도 되지만, 인스턴스를 바로 생성해도 된다
        Person[] pers = new Person[] {
                new Student("김예진", 17,0),
                new Police("이지우", 17,"비리경찰"),
        };

        // 업 캐스팅된 하위 클래스가 원래 어던 타입인지 판별할 수 있다
        // 이때, instanceof 라는 키워드를 사용한다

        System.out.println(pers[0] instanceof Student);
        // 해석 : pers[0]은 학생이 맞습니까? true

        System.out.println(pers[0] instanceof Police);
        // 해석 : pers[0]은 경찰이 맞습니까? false
    }
}
