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
        Node res = null;
        res = LinkedListBasicMethods.insertNodeAtBegin(res, 10);
        res = LinkedListBasicMethods.insertAtSpecificLocation(res, 5, 2);
        res = LinkedListBasicMethods.insertAtSpecificLocation(res, 20, 2);
        res = LinkedListBasicMethods.insertNodeAtEnd(res, 30);
        LinkedListBasicMethods.traverseList(res);

        int[] arr = { 1, 2, 3, 4, 5, 8, 10 };
        int index = Searching.binarySearch(arr, 2);
        System.out.println(index);
    }
}