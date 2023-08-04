package other;

// package class
// - 외부에서 사용 불가능한 클래스
// - 같은 패키지에서만 공유된다
// - 하지만 파일명과 달라도 되므로
// - 한페이지에 여러개 작성가능
public abstract class Animal {

    // 일반 메서드
    public void eat(){
        System.out.println("밥을 먹는다");
    }

    // 추상 메서드
    // - 실행코드를 가질 수 없는 껍데기 메서드
    // - 상속 받은 자식 클래스에서 무조건 오버라이드를 해야한다
    public abstract void bark();
}

class Phone{

}


