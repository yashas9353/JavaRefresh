import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public int findFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorial(number - 1);
    }

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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.set(0, 15);
        System.out.println(list);
        list.remove();
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.remove(0);

        // Note to be pointed = so for ArrayList we need to specify index to remove.

        // so LinkedList which is part of List interface inserts elemnt
        // at the end of the list and removes element from the end of the list
    }
}