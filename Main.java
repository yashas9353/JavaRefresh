public class Main {
    public static void main(String[] args) {
        try {
            Integer x = 10;
            String y = String.valueOf(x);
            System.out.println(y.getClass().getSimpleName());

            enum Color {
                RED, GREEN, BLUE;
            }

            System.out.println(Color.RED);

            TestInterface obj = () -> {
                System.out.println("Hello World!");
            };

            obj.hello();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}