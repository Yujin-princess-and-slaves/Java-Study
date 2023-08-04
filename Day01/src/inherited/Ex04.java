package inherited;

import other.Person;

public class Ex04 {
    public static void main(String[] args) {
        // 업캐스팅은 하위 클래스를 묶어서 처리하기 위함
        Student stu = new Student("배재현", 17, 98);
        Police pol = new Police("전유진", 17, "청장");

        // 학생들 모여라
        // - 경찰(pol)은 낄 수 없다
        // Student[] stus = new Student[] { stu, pol };

        // 경찰들 모여라
        // - 학생(stu)은 낄 수 없다
        // Police[] pols = new Police[] { stu, pol };

        // 사람들 모여라
        // - 경찰, 학생 둘 다 낄 수 있다 (= 업 캐스팅)
        Person[] pers = new Person[] { stu, pol };

        pers[0].showInfo();     // 업 캐스팅시, 부모의 멤버는 참조 가능
        pers[1].showInfo();
    }
}
