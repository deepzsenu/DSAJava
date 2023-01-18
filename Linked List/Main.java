import java.util.*;
class Node<T>{
    T data;
    Node<T> next;
}

class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    void add(T value){
        Node<T> temp = new Node<>();
        temp.data = value;
        temp.next = null;
        if (size == 0){
            head = tail = temp;
        }

        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int size(){
        return size;
    }

    void display(){
        Node<T> temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void removeFirst(){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
            size--;
        }
    }

    <T> Object getAt(Node<T> head, int ind){
        if(size == 0){
            System.out.println("LL is empty");
            return null;
        }
        if (ind >= size || ind<0){
            System.out.println("wrong index");
            return null;
        }
        Node<T> cur = head;
        while(ind>0){
            cur = cur.next;
            ind --;
        }
        return cur.data;
    }

    void addFirst(T data){
        Node<T> temp = new Node<>();
        temp.data = data;
        temp.next =  head;
        head = temp;
        size++;
    }
    void addLast(T data){
        Node<T> temp = new Node<>();
        temp.data = data;
        tail.next =  temp;
        tail = temp.next;
        size++;
    }

    void addAt(T data, int ind){

    }

}

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            ll.add(arr[i]);
        }
        ll.display();
        System.out.println("\n"+ll.size());
        // ll.removeFirst();
        System.out.println(ll.getAt(ll.head, 4));
        System.out.println(ll.getAt(ll.head, 34));
        System.out.println(ll.getAt(ll.head, -4));
        ll.addFirst(67);
        ll.display();
        ll.addLast(63);
        ll.display();
    }
}
