package org.sample.linkedlist;/*
 * @author -Suraj Tiwari
 */

public class LinkedList {
    Node head=null;

    public void insertNodeAtBegining(Node node){
        if(head==null) {
            head = node;
            head.nextNode = null;
        }
        else{
          node.nextNode=head;
          head=node;
        }

    }
    public void print(Node head){

        while(head.nextNode!=null){
            System.out.print(head.data);
            System.out.print("->");
            head=head.nextNode;
        }
        System.out.println(head.data+"->"+null);
    }

    public static void main(String[] args) {

        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        LinkedList list=new LinkedList();
        list.insertNodeAtBegining(n1);
        list.insertNodeAtBegining(n2);
        list.insertNodeAtBegining(n3);
        list.insertNodeAtBegining(n4);

        list.print(n4);

    }
}

class  Node{

    int data;
    Node nextNode;
    public Node(int data){
        this.data=data;
    }
}
