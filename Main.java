public class Main {

    public boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (number / i != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public int findGCD(int n1, int n2) {
        int res = 0;
        int min = Math.min(n1, n2);
        for (int i = min; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                res = i;
                break;
            }
        }
        return res;
    }

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
        // main.extractDigit(12345);
        System.out.println(main.findGCD(9, 12));
        System.out.println(main.checkPrime(2));
    }
}