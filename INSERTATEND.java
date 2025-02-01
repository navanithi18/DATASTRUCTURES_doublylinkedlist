import java.util.*;
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
    this.data=data;
    this.prev=null;
    this.next=null;
    }
}
class DLL
{
    Node head,tail;

    public void insertatend(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            }
        }
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("LIST iS EMPTY");
            }
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<==>");
                }
                temp=temp.next;
            }
            System.out.println();
        }
    }
public class INSERTATEND{
    public static void main (String [] args){
        DLL link= new DLL();
        link.insertatend(10);
        link.insertatend(20);
        link.insertatend(30);
        link.insertatend(40);
        link.insertatend(50);
        link.insertatend(60);
        link.display();
    }
        
}
    
