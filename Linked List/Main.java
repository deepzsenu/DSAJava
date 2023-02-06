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
        if(ind <0 || ind>size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        else if (ind == size){
            addLast(data);
        }
        else{
            Node<T> node = new Node<>();
            node.data =data;

            Node<T> temp = head;
            for (int i = 1; i < ind; i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    void removeLast(){
        if (head == null){
            System.out.println("List is empty");
        }
        else if ( size == 1){
            head = null;
            size = 0;
        }
        else{
            Node<T> temp = head;
            for (int i = 0; i <size-2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next =  null;
            size--;
        }
    }


    private Node<T> getNodeAt(int ind){
        Node<T> cur = head;
        while(ind>0){
            cur = cur.next;
            ind --;
        }
        return cur;
    }
    void reverseIterative(){
        Integer li = 0;
        Integer ri = size-1;
        while(li<ri){
            Node<T> left = getNodeAt(li);
            Node<T> right = getNodeAt(ri);
            T  temp = left.data;
            left.data = right.data;
            right.data  = temp;
            li++;
            ri--;
        }
    }

    void reversePointerIterative(){
        Node<T> prev =  null;
        Node<T> curr = head;
        while(curr != null){
            Node<T> orignal  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = orignal;
        }
        Node<T> temp = head;
        head = tail;
        tail = temp;
    }
    void removedAtIndex(int idx){
        if(idx<0|| idx>=size){
            System.out.println("Invalid Arguments");
        }
        else if(idx == 0){
            removeFirst();
        }
        else if (idx == size-1){
            removeLast();
        }
        else{
            Node<T> temp = head;
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
         }
        size--;
    }
    <T>Object kthNode(int k){
        Node<T> fast = (Node<T>) head;
        Node<T> slow = (Node<T>) head;
        while(k-- > 0){
            fast = fast.next;
        }
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;

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
        ll.addAt(56, 3);
        ll.display();
        ll.removeLast();
        ll.display();
        ll.reverseIterative();
        ll.display();
        ll.reversePointerIterative();
        ll.display();
        ll.removedAtIndex(3);
        ll.display();
        System.out.println(ll.kthNode(4));
    }
}
