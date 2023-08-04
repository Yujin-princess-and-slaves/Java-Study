package interaction;

class Ball{
    String type;

    Ball(String type){
        this.type = type;
    }
}

class Child{
    String name;
    Ball ball;      // null <= 인스턴스 생성 X

    Child(String name){
        this.name = name;
    }

    void show(){
        String result = "%s (공 : %s)\n";
        String type = (ball == null) ? "없음" : ball.type;

        System.out.printf(result, name, type);
    }

    void takeBall(Ball ball){
        this.ball = ball;

        String result = "\n%s(이)가 %s(을)를 얻었다!!";

        System.out.printf(result, name, ball.type);
    }

    void throwBall(Child targer){
//        targer.ball = ball;

        String result = "\n%s(이)가 %s에게 %s(을)를 던졌다!!\n";
        System.out.printf(result, name, targer.name, ball.type);
        targer.takeBall(ball);

        ball = null;
    }
}
public class Ex02 {
    public static void main(String[] args) {
        Child minsu = new Child("민수");
        Child jinho = new Child("진호");

        minsu.show();
        jinho.show();

        Ball base = new Ball("야구공");

       minsu.takeBall(base);

        minsu.show();
        jinho.show();

        minsu.throwBall(jinho);

        minsu.show();
        jinho.show();
    }
}
