public class Main {

    public static synchronized void hello() throws ArithmeticException {
        int res = 1 / 0;
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        try {
            hello();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hello World!");
    }
}