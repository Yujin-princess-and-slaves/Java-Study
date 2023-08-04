package method;

public class Ex02 {
    // 매개변수 (parameter)
    // - 메서드 호출시 전달된 값을 저장하는 변수(지역 변수)
    // - 외부로 부터 값을 받아야하며, 직접 초기화 할 수 없다
    static void hello(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        hello(3);   // 이때 전달하는 친구
                        // 전달인자 (arguments) : 메서드 호출시 전달하는 값

        hello(1);

        hello(6);

        // 잘못된 사용 방식
        // hello();         전달인자 부족
        // hello(3, 4);     매개변수 불일치
        // hello(3.0);      자료형 불일치
        //
        // 즉, 전달인자와 매개변수는 개수 및 자료형이 일치해야한다.
    }
}
