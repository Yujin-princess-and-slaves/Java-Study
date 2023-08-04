package other;

public class Doctor extends Person{
    private String major;


    public Doctor(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void showInfo(){
        String result = "%s (%d세, %s)\n";
        System.out.printf(result, name, age, major);
    }

    public void cure(Person per){
        String result = "%s의 %s(이)가 %s(을)를 치료한다\n";
        System.out.printf(result, major, name, per.getName());
    }
}
