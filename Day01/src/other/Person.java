package other;

public class Person {
    public String name;         // public
    // int age;                    // package
    public int age;
    private double height;      // private

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
        name = "김예진";
        age = 16;
        height = 140.5;
    }

    public void showInfo(){
        String result = "%s (%d세, %.1fcm)\n";
        System.out.printf(result, name, age, height);
    }

    public void eat(String food){
        System.out.printf("%s가 %s를 먹는다\n", name, food);
    }

    public String getName() {
        return name;
    }
}
