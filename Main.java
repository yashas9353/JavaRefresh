import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // CRUD operations

        list.add(10);
        list.add(0, 20);
        System.out.println(list.get(0));
        list.set(0, 30);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashMap<String, Integer> studentData = new HashMap<>();
        studentData.put("yashas", 100);
        studentData.put("Vaarshitha", 150);
        System.out.println(studentData.get("yashas"));

        list.add(0, 20);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(Collections.frequency(list, 10));

        System.out.println(list);
    }
}