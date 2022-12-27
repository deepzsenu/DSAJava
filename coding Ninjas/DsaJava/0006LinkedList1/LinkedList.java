// package coding Ninjas.DsaJava.0006LinkedList1;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

// import Node.java;
public class LinkedList{
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(10);
        n.next = new Node<>(20);
        n.next.next = new Node<>(30);
        n.next.next.next = new Node<>(40);
        Node h = n;
        while(h!=null){
            System.out.println(h.data);
            h= h.next;
        }
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print(node2);

    }
}