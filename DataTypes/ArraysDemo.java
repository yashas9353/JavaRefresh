package DataTypes;

public class ArraysDemo {
    public int[] demoArray = new int[5];
    public int[] demoArray2 = { 10, 20, 30 };

    public boolean insertIntoArray(int element) {
        demoArray[0] = element;
        return false;
    }
}
