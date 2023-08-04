package inherited;

import other.Doctor;
import other.Person;

class Airplain{
    Person[] sits = new Person[ 10];     // 비행기 좌석

    void rideOn(Person per){
        for(int i = 0; i < sits.length; i++){
            if(sits[i] == null){
                sits[i] = per;

                System.out.println(per.getName() + "님 탑승");
                return;
            }
        }
        System.out.println("빈 좌석이 없습니다");
    }

    void list(){
        System.out.println();
        for(int i = 0; i < sits.length; i++){
            System.out.print(i + 1 + "번 좌석 : ");

            if(sits[i] != null){
                sits[i].showInfo();
            }
            else{
                System.out.println("-- 빈좌석 --");
            }
        }
    }

    void emergency(Person per){
        System.out.println("\n긴급상황!!! 기내에서 의사를 찾습니다");

        for (int i = 0; i < sits.length; i++){
            if(sits[i] instanceof Doctor){
                System.out.println(i + 1 + "번 좌석에서 의사 발견!!!");

                Doctor doc = (Doctor) sits[i];

                doc.cure(per);
            }
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        Student stu = new Student("홍길동", 19, 92);
        Police pol = new Police("김진호", 30, "순경");
        Doctor doc = new Doctor("이진희", 40, "내과");
        Person per = new Person("고길동", 22);

        Airplain air = new Airplain();

        air.rideOn(stu);        // 비행기에 '사람'이 탑승하는 메서드
        // ~ 님 탑승
        air.rideOn(pol);        // 탑승 순서대로 자리에 순차적으로 착석 시킨다
        air.rideOn(doc);        // 좌석이 모자라면, 자리 없다고 출력
        air.rideOn(per);        // 빈 자리가 없습니다

        air.list();             // 승객 목록을 출력
        // ~번 좌석 : ~
        // -- 빈좌석 --

        air.emergency(stu);     // 긴급 상황 메서드
                                // 기내에서 의사를 찾아서
                                // 전돨된 '사람'을 치료하라
        // 긴습상황!!! 기내에서 의사를 찾스빈다
        // ~번 좌석에서 의사 발견
        // doctor cure메서드 사용
    }
}
