package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/4/11.
 * java
 */
public class MyLinkedList {
    private Node first;
    private Node last;
    public MyLinkedList(){

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        System.out.println(myLinkedList.first);
        System.out.println(myLinkedList.last);
    }
    public boolean add(String element){
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {

        }
        return true;

    }
    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }


    private class Node{//节点

        String element;
        Node prev;//以前的
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
