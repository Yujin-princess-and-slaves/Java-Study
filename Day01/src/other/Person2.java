package other;

public class Person2 {
    protected String name;
    protected int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        String result = "%s (%d세)\n";

        System.out.printf(result, name, age);
    }

    public void eat(String food){
        String result = "%s(이)가 %s(을)를 먹는다\n";

        System.out.printf(result, name, food);
    }

    public String getName() {
        return name;
    }
}
