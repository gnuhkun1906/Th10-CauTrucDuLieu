package bt2;

public class TestMyLinkedLink {
    public static void main(String[] args) {
        MyLinkedList testList = new MyLinkedList(10);
        testList.addFirst(11);
        testList.addFirst(12);
        testList.addFirst(13);

        testList.add(4,9);
        testList.add(4,9);
        testList.printList();
    }

}
