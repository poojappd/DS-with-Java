
public class Main
{
	Node head;
	Node tail;
	class Node{
	    int data;
	    Node next;
	    
	    Node(int data){
	        this.data=data;
	        this.next=null;
	    }
	}
	 void addnode(int data){
	    Node newnode=new Node(data);
	    
	    if(head==null){
	        head=newnode;
	        tail=newnode;
	    }
	    else{
	        tail.next=newnode;
	        tail=newnode;
	    }
	}
	 void display(){
	    Node current=head;
	    if(current==null){
	        System.out.print("Empty");
	        return;}
	    while(current!=null){
	        System.out.print(current.data+" ");
	        current=current.next;
	    }     
	    
	    System.out.println();
	}
	void sortll(){
	    Node current=head,index=null;int temp;
	    if(head==null){
	        System.out.println("list empty");
	        return;
	    }
	    else{
	        while(current!=null){
	            index=current.next;
	            while(index!=null){
	                if(current.data>index.data){
	                    temp=current.data;
	                    current.data=index.data;
	                    index.data=temp;
	                }
	                index=index.next;
	            }
	            current=current.next;
	        }
	    }
	}
	public static void main (String[] args) {
	    Main linkedlist=new Main();
	    for(int i=10;i>=0;i--){
	    linkedlist.addnode(i);}
	    
	    linkedlist.display();
	    linkedlist.sortll();
	    linkedlist.display();
	}
}
