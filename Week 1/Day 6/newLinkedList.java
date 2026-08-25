import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


class SinglyLinkedList {
    Scanner sc = new Scanner(System.in);
    Node start;

    Node createNode() {
        System.out.println("Enter value");
        return new Node(sc.nextInt());
    }

    void insertAtLast() {
        Node newNode = createNode();

        if (this.start == null) {
            this.start = newNode;
            return;
        }
        Node t = this.start;
        while (t.next != null) {
            t = t.next;
        }

        t.next = newNode;

    }
    void insertAtFirst(){
        Node newNode=createNode();

        if(this.start==null){
            this.start=newNode;
            return;
        }

        newNode.next=this.start;
        this.start=newNode;


    }

    void displayAllNodes() {
        if (this.start == null) {
            System.out.println("List is empty");
            return;
        }
        Node t = this.start;
        while (t != null) {
            System.out.print(t.data + "==> ");
            t = t.next;
        }
    }
void deleteLastElement(){
    if(this.start==null){
        System.out.println("List is empty!!");
    }
    Node t=this.start;

    while(t.next.next!=null){
        t=t.next;
    }
    t.next=null;
}
}

public class newLinkedList {
    
    public static void main(String[] args) {
        SinglyLinkedList linkedList=new SinglyLinkedList();
        
        linkedList.insertAtLast();
        linkedList.insertAtLast();
        linkedList.insertAtLast();
        linkedList.insertAtLast();
        
        linkedList.displayAllNodes();
       
        linkedList.insertAtFirst();
        linkedList.displayAllNodes();
        linkedList.deleteLastElement();
        System.out.println();
        linkedList.displayAllNodes();
    // while(){
        
    // }
    }

}
