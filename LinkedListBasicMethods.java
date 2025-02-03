public class LinkedListBasicMethods {
    public static void traverseList(Node n1) {
        Node curr = n1;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
