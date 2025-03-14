package gr.aueb.cf.ch19.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SingleList<Integer> list = new SingleList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);

        Node<Integer> numNode = list.removeLast();
        int num = numNode.getItem();
        System.out.println(num);
        list.traverse();
    }
}
