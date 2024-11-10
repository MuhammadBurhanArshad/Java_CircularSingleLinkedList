public class CircularSinglyLinkedList {

    private Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data == value) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != head && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != head) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Node with value " + value + " not found.");
        }
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        System.out.println("Middle Element: " + slow.data);
    }

    public void insertAfter(int newData, int prevData) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp.data != prevData) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Previous node with value " + prevData + " not found.");
                return;
            }
        }

        Node newNode = new Node(newData);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean isCircular() {
        if (head == null) {
            return false;
        }

        Node temp = head;
        while (temp.next != null && temp.next != head) {
            temp = temp.next;
        }

        return temp.next == head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
