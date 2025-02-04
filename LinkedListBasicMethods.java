public class LinkedListBasicMethods {
    public static void traverseList(Node n1) {
        Node curr = n1;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static boolean searchLinkedList(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static Node insertNodeAtBegin(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertNodeAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }
}
