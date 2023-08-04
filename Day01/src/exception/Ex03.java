package exception;

public class Ex03 {
    public static void main(String[] args) throws InterruptedException {
        // try ~ catch는 너무 남발할 시 코드의 가독성을 해친다
        // - 따라서, 예외를 한 곳에서 모아서 처리하는 형태를 취한다
        // - 이때, throws라고 해서 예외를 전가 시킬 수 있다
        // ※ main에서 예외를 전가하게 되면 JVM이 받아서 처리한다

        for (int i = 5; i >= 1; i--){
            System.out.println(i + "초");
            Thread.sleep(1000);
        }
    }
}
