package accessModifier;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Car {
    private String model;
    private int speed;
    private Person driver;

    Car(String model) {
        this.model = model;
    }

    void showCar() {
        String result = "%s (%d km/h, %s)\n\n";
        String name = (driver == null) ? "없음" : driver.getName();

        System.out.printf(result, model, speed, name);
    }

    void accel(int speed) {
        if (driver == null) {
            System.out.println("운전자가 없습니다!!!\n");
            return;
        }

        this.speed += speed;

        System.out.println(speed + "km/h 가속");

        showCar();
    }

    void rideOn(Person driver) {
        this.driver = driver;

        System.out.println(driver.getName() + "님 승차");

        showCar();
    }

    void _break(int speed) {
        if (driver == null) {
            System.out.println("운전자가 없습니다!!!\n");
            return;
        }

        this.speed -= speed;

        System.out.println(speed + "km/h 감속");

        showCar();
    }

    void rideOff() {
        System.out.println(driver.getName() + "님 하차");

        driver = null;
        showCar();
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        // 아래 코드가 동작하게 한다
        // 단, 필드는 모두 private로 처리한다

        Person per = new Person("홍길동"); 	// 필드는 이름
        Car car = new Car("모닝"); 			// 필드는 모델명, 속도, 운전자(= 사람)

        car.showCar(); 						// 모닝 (0 km/h, 없음)

        car.accel(30); 						// 자동차가 가속하는 메서드
        // 단, 운전자가 없으면 동작하지 않는다

        car.rideOn(per); 					// 자동차에 사람이 탑승하는 메서드

        car.accel(30); 						// 30 km/h 가속

        car._break(30); 					// 20 km/h 감속

        car.rideOff(); 						// 사람이 하차하는 메서드
        // 단, 속도가 0아니면 하차 불가능










    }
}
