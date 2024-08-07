public class LinkedList {
    //Node class is used to create a single element in linked list
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){//initializing single node with data
        this.data=data;
        this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//addfirst O(1)
    public void addFirst(int data){
        //create a node
        Node newnode = new Node(data);
        size++;
    
    if(head == null){//empty linked list
        head = tail = newnode;
        return;
    }
    else{
        //new node point to head node
        newnode.next = head;
        //change head to new node
        head= newnode;
    }
    
    } 

    //add last O(1)
    public void addLast(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }

    //print linked listO(n)
    public void print(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println(" size of the list is " +size);
        System.out.println();
    }
//add in middle O(n)
    public void add(int idx,int data){
        if(idx ==0){
            addFirst( data);
            return;
            
        }
        Node newnode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;

    }
//remove first O(1)
    public int removeFirst(){
        int value = head.data;
        if(size==0){
            return -1;
        }
        if(size==1){
            System.out.println(value);
            size--;
        }
        else{
            head=head.next;
            System.out.println(value);
            size--;
        }
        return value;
    }
//remove last O(1)
    public int removeLast(){
        int value = tail.data;
        if(size==0){
            return -1;
        }
        if(size==1){
            System.out.println(value);
            size--;
        }
        else{
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
                i++;
            }
            prev.next=null;
            tail=prev;
            System.out.println(value);
            size--;
        }
        return value;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx =helper(head.next, key);
        return idx+1;
    }
//search a key using recursion O(n)
    public int recSearch(int key){
        return helper(head, key);
    }
//reverse a list
    public void reverseList(){
        Node prev=null;
        Node curr=tail=head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
//findmid
    public Node FindMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
//check if ll is palindrome
    public boolean isPalindrome(){
        if(head== null || head.next==null){
            return true;
        }
    //step 1- to find the mid
        Node mid = FindMid(head);
    //step2-reverse ll from mid to null
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    //step3-to check left part of ll and right part of ll
        Node left=head;
        Node right =prev;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
//delete nth node from end
    public void DelFromLast(int n){
        //calculate size
        int sz=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        //traverse till size-n 
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev= prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
    }
//detecting cycle in ll
    public  static boolean isCycle(){
        if(head==null ||head.next==null){
            return false;
        }
        Node slow = head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }


//remove the cycle in ll
    public static void RemoveCycle(){
        //detect if cycle is present
        boolean iscycle=false;
        Node slow= head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                iscycle=true;
                break;
            }
        }
        if(iscycle=false){
            return;
        }
        
        //if cycle yes then,make lastnode.next = null
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //break the link and make prev.next=null
        prev.next=null;
    }
    public Node getMid(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergedLL= new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            temp=temp.next;
            head1=head1.next;
        }
        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }
        return mergedLL.next;
    }
//merge sort on ll
    public Node mergesort(Node head){
        if(head==null|| head.next!=null){
            return head;
        }
        //find mid
        Node mid =getMid();
        //recursion on left and right part
        Node righthead=mid.next;
        mid.next=null;
        Node left=mergesort(head);
        Node right=mergesort(righthead);

        //merge both parts
        return merge(left,right);
    }
//point of intersection of 2 list
    public static int getIntersectionpoint(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
         while(temp1!=null){
             while(temp2!=null){
                 if(temp1.data==temp2.data){
                     return temp2.data;
                 }
                 temp2=temp2.next;
             }
             temp2=head2;
             temp1=temp1.next;
         }
        return 0;
        
    }
//deleted m keep n
    public Node delM_keepN(Node head,int M,int N){
        Node temp=head;
        while(temp!=null){
            for(int i=1;i<M;i++){
                temp=temp.next;
            }
            for(int i=0;i<N;i++){
                temp.next=temp.next.next;
                size--;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void getMergingPoint(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==null && temp2==null){
                System.out.println("null");
            }
            if(temp1==null){
                temp1=head2;
            }
            if(temp2==null){
                temp2=head1;
            }
        }
        System.out.println(temp1.data);
    }
//swapping data
    public Node SwapData(Node head,int x,int y){
       if(head==null ||head.next==null){
        return head;
       }
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                temp.data=y;
            }
            else if(temp.data==y){
                temp.data=x;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();//creating an ll object i.e creating a linked list
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);
         ll.addFirst(5);
         ll.addFirst(6);
         ll.addFirst(7);
         ll.addFirst(8);
         int x=2,y=4;
         ll.print();
         ll.SwapData(head,x,y);
         ll.print();
         //int M=2,N=2;
         //ll.delM_keepN(head,M,N);
  
        //  ll.print();
        //  ll.mergesort(head);
        //  ll.print();
        //int key =28;
        //System.out.println(ll.recSearch(key));
        //System.out.println( ll.isPalindrome());
        //  ll.reverseList();
        //  ll.print();
        // // ll.DelFromLast(1);
        // head =new Node(1);
        // head.next =new Node(2);
        // head.next.next=new Node(3);
        // Node temp=head.next.next;
        // head.next.next.next =temp;
        // System.out.println(isCycle());
        // RemoveCycle();
        // System.out.println(isCycle());
        // Node head1=new Node(1);
        // head1.next=new Node(2);
        // Node Intersection=new Node(5);
        // head1.next.next=Intersection;
        // Intersection.next=new Node(6);
        // Node head2=new Node(3);
        // head2.next=new Node(4);
        // head2.next.next = Intersection;
       
        // getIntersectionpoint(head1, head2);
        // int output = getIntersectionpoint(head1, head2);
        // if(output==0){
        //     System.out.println("there is not merging point");
        // }else{
        //     System.out.println("both lists merger at node with value" +getIntersectionpoint(head1, head2));
        // }
        //getMergingPoint(head1, head2);

       
        
    }
}
