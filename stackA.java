import java.util.*;
public class stackA {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next =null;
    //     }
    // }
    // static class Stack{
        // static ArrayList<Integer> list=new ArrayList<>();
    
        // //isempty
        // public static  boolean isEmpty(){
        //     return list.size() ==0;
        // }
        // //push
        // public static void push(int data){
        //     list.add(data);
        // }
        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top=list.size()-1;
        //     list.remove(top);
        //     return top;
        // }
        // //peek
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return list.get(list.size()-1);
        // public static Node head=null;
        // //isempty
        // public static boolean isEmpty(){
        //     return head==null;
        // }
        // //push
        // public static void push(int data){
        //     Node newnode = new Node(data);
        //     if(isEmpty()){
        //         head= newnode;
        //         return;
        //     }
        //     newnode.next=head;
        //     head=newnode;
        // }
        // //pop
        // public static Node pop(){
        //     if(isEmpty()){
        //         return null;
        //     }
        //     Node top = head;
        //     head=head.next;
        //     return top;
        // }
        // //peek
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return head.data;
        // }


        //}
    public static void pushAtBottom(Stack<Integer>s,int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, value);
        s.push(top);
    }
//reverse a string 
    public static String ReverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            //char curr = s.pop();
            result.append(s.pop());
        }
        return result.toString();
        }
//reverse a stack
    public static void ReverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        
        int top = s.pop();
        ReverseStack(s);
        pushAtBottom(s, top);
    }
//print a stack
    public static void PrintStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
//stock span problm
    public static void stockSpanPrblm(int arr[]){
        int span[]=new int[arr.length];
        Stack<Integer> highest = new Stack<>();//index of highest stock
        span[0]=1;
        highest.push(0);
      
        for(int i=1;i<arr.length;i++){
            int currstock=arr[i];
              //step1 while
              while(!highest.isEmpty() && currstock>arr[highest.peek()]){
                highest.pop();
              }
              //step2 if else
              if(highest.isEmpty()){
                span[i]=i+1;
              }else{
                int prevhigh= highest.peek();
                span[i]=i-prevhigh;
              }
              //push 
              highest.push(i);
            }

        //for loop to print span
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
//next greatest element time O(n)
    public static void nextGreatestElemRight(int arr[]){
        int greater_elem[]=new int[arr.length];
        Stack<Integer>s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            //step 1 while loop
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }

            //step2 if else
            if(s.isEmpty()){
                greater_elem[i]=-1;
            }else{
                greater_elem[i]=arr[s.peek()];
            }

            //step3 push 
            s.push(i);
        }
        for(int i=0;i<greater_elem.length;i++){
            System.out.print(greater_elem[i]+"");
        }
        System.out.println();
    }

//valid paranthisis
    public static boolean validParanthisis(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' ||ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='{' && ch=='}') ||(s.peek()=='(' && ch==')')||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // ReverseStack(s);
        // PrintStack(s);

        // pushAtBottom(s, 4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //    s.pop();
        // }
        // String str ="abc";
        // String result = ReverseString(str);
        // System.out.println(result);
        // int arr[]={100,80,60,70,50,85,100};
        // stockSpanPrblm(arr);
        //int arr[]={6,5,7,8,2,0};
        // nextGreatestElemRight(arr);
        String str ="([{})()";
        System.out.println( validParanthisis(str));


        }
    }

