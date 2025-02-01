package Doublylinkedlist;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class dll{
    Node head,tail;
    public void insertAtbegin(int data){
        Node newNode=new Node( data);
        if(head==null)
        {head=tail=newNode;}
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }


}

public class INSERTATBEINING {
    public static void main (String []args){
        dll l=new dll();
        l.insertAtbegin(10);
        l.insertAtbegin(20);
        l.insertAtbegin(30);
        l.insertAtbegin(40);
        l.insertAtbegin(50);
        l.insertAtbegin(60);
        l.insertAtbegin(70);
        l.insertAtbegin(80);

        l.display();

    }
}







































































