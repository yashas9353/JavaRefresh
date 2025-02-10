public class LinkedListBasicMethods {
    public static void traverseList(Node n1) {
        Node curr = n1;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static int getListlength(Node head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
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

    public static Node insertAtSpecificLocation(Node head, int val, int position) {
        Node newNode = new Node(val);
        if (position == 1) {
            head = newNode;
            return head;
        } else if (position < 1) {
            System.out.println("Invalid position");
            return head;
        }
        int i = 1;
        Node current = head;
        while (current != null && i < position - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;

    }
}