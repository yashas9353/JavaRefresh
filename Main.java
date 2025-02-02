public class Main {
    public void extractDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.extractDigit(12345);
    }
}