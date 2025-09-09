package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public String toStrings(Node n)
    {
        StringBuilder str= new StringBuilder();
        while(n.next != null) {
            str.append(n.data+" ");
            n=n.next;
        }
        return str.toString();
    }
}

public class RotateTheList
{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node n=head;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(n!=null)
        {
            list.add(n.data);
            n=n.next;
        }
        int k=4;
        k=k%list.size();
        System.out.println("k "+k);
        System.out.println(list.size());
        Queue<Integer> s=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            s.add(k);
        }
       LinkedList<Integer> str=new LinkedList<>();
        for(int i=k;i<list.size();i++)
        {
            str.add(list.get(i));
        }
        System.out.println(str);
        for(int i=0;i<k;i++)
        {
            str.addLast(list.get(i));
        }
        System.out.println(str);
    }


}
