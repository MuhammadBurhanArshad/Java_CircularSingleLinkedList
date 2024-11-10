public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        
        list.insert(2312395);
        list.insert(2312396);
        list.insert(2312397);
        list.insert(2312398);
        
        System.out.println("Original Circular Linked List:");
        list.display();

        list.delete(2312395);
        System.out.println("After deleting node with value 2312395:");
        list.display();

        list.findMiddle();

        list.insertAfter(2312395, 2312396);
        System.out.println("After inserting 2312395 after 2312396:");
        list.display();

        System.out.println("Is the list circular? " + list.isCircular());
    }
}
