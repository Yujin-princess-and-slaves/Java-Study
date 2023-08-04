package accessModifier;

/*
* access 메서드
* - 외부에서 접근할 수 없는 멤버에 접근을 지3
* "
* 원하는 메서드
* - 직접적으로 멤버를 외부에 공개하는 것보다
* - access 메서드로 간접 접근시 코드에 안정성을 가져옴
*
* 즉, 일단 막고 필요할 때 열어준다
*
* 작성 방식)
* get변수명(), set변수명()
* */

class KimchFactory{
    private String name;
    private String boss;
    void show(){
        String result = "%s공장은 %s사장님의 공장입니다.";
        System.out.printf(result, name, boss);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getName(){
        return name;
    }

    public String getBoss() {
        return boss;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        KimchFactory kf = new KimchFactory();
        
        // kf.name = "이지우의 미래공장";
        kf.setName("이지우가 다닐곳");
        kf.setBoss("뽀삐배");

        kf.show();

        System.out.println();
        System.out.println("공장의 이름 : " + kf.getName());
        System.out.println("사장의 이름 : " + kf.getBoss());
    }
}
