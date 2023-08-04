package inherited;

import other.Person;

class Police extends Person{
    private String rank;

    public Police(String name, int age, String rank) {
        super(name, age);
        this.rank = rank;
    }

    void findDrug(String area){
        String result = "%s %s(이)가 %s(을)를 수사하다\n";
        System.out.printf(result, rank, name, area);
    }

    @Override
    public void showInfo() {
        String result = "%s (%d세, %s)\n";
        System.out.printf(result, name, age, rank);
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Police pol = new Police("배재현", 17, "경찰견");

        pol.showInfo();
        pol.eat("개껌");

        pol.findDrug("부산 광역시 사상구 덕포동");
    }
}
