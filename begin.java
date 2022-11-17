//Insertion at begining
public class Main
{
        class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public Node head = null;
        public Node tail = null;
        
        
        public void start(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                Node temp = head;
                head = newNode;
                head.next=temp;
            }
        }
        public void display(){
            Node current = head;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            System.out.println("adding nodes to the list");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        
	public static void main(String[] args) {
	    Main list = new Main();
	    list.start(7);
	    list.display();
	    list.start(47);
	    list.display();
	    list.start(77);
	    list.display();
	}
}
		
	
