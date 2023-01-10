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
    static void fun(Node start)
    {
      if(start == null)
        return;
      System.out.print( start.data);
      if(start.next != null )
        fun(start.next.next);
      System.out.print(start.data);
    }
    static Node<Integer> reverse(Node<Integer> head){
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        Node<Integer>  curr = head;
        Node<Integer> prev = null;
        while(curr!= null){
            Node<Integer> temp = curr.next;
            curr.next = prev;
            prev =  curr;
            curr = temp;
        }
        return prev;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(1);
        n.next = new Node<>(2);
        n.next.next = new Node<>(3);
        n.next.next.next = new Node<>(4);
        n.next.next.next.next = new Node<>(5);
        n.next.next.next.next.next = new Node<>(6);
        // fun(n);
        Node<Integer>h = n;
        // while(h!=null){
        //     System.out.println(h.data);
        //     h= h.next;
        // }
        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(20);
        // node2.next = node1;
        Node<Integer> s = reverse(n);
        print(s);

    }
}