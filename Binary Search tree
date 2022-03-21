public class Main //class BST
{ 
    Node root;
    class Node{
        int data;
        Node left,right;
      
        Node(int data){
          this.data=data;
          left=right=null;
        }
    } 
    public void insert(int i){
    root = insert(root, i);
  }
        Node insert(Node node,int data){
          //Node newnode=new Node(data);
          if(node==null)
              
              return new Node(data);
              
          
          else if(data<node.data)
            node.left=insert(node.left,data);
        
          else if(data>node.data)
           node.right=insert(node.right,data);
           
           return node;
          
        }
        
        void display(Node node){
          if(node != null){    
            display(node.left);
            System.out.print(node.data+" ");
            display(node.right);
          }
            
        }
        
        public static void main (String[] args) {
            Main bst=new Main();
            for(int i=10;i>0;i--){
                //System.out.println(i);
            bst.insert(i);
                bst.display(bst.root);
                System.out.println();
            }
            
        }
        
  
}
