public class RecursionII{
//first occurence of a num
     static  int firstoccurence(int arr[],int key,int i){
        if(i==arr.length){
           return -1;
        }
        if(arr[i]==key){
         return i;
        }
         return firstoccurence(arr, key, i+1);
    }
//last occurence of a num
    public static int LastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound =LastOccurence(arr, key, i+1);
        if(isFound !=-1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return isFound;
    }

//print x power n t.c==O(n)

    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x * power(x,n-1);
    }    

//print powet(x,n) optimized method t.c =O(logn) 
    public static int optimizedpower(int x,int n){
        if (n==0){
            return 1;
        }
        int halfpower=optimizedpower(x, n/2);
        //if n=even
        int optimized_sol=halfpower*halfpower;
        //if n=odd
        if(n%2!=0){
        optimized_sol = x *optimized_sol;
        }
        return optimized_sol;
    }

//tailing problem--//calculating num of ways we can fill the floor (2*n) with tiles(2*1).(note:floor dimension can be (anything*n) and the code will remain same as we are calculating num of ways to fill the floor but not how we are filling it.
    
    public static int tailingPrblm(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //logic
        //choices
        //vertical way
        int fnm1 = tailingPrblm(n-1);
        //horizontal way
        int fnm2= tailingPrblm(n-2);
        //total ways to fill the floor
        int totalWays=fnm1+fnm2;
        return totalWays;
    }

//remove duplicates in java
    public static void RemoveDuplicates(String str,StringBuilder newstr,int i,boolean map[]){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(i);
        if(map[currchar-'a']!=true){
            map[currchar-'a']=true;
            newstr.append(currchar);
            RemoveDuplicates(str, newstr, i+1, map);
        }
        else{
            
            RemoveDuplicates(str,newstr,i+1,map);
        }
    }
//pairing with friends -calculate num of ways a friend can remain single  or pair with only one person
    public static int FriendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);
    }
//binary string with no consecutive ones
    public static void BinaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1, 0, str+"0");
        if(lastplace==0){
            BinaryString(n-1, 1, str+"1");
        }
    }
//searching key and returning index where its found
    public static void SearchKey(int arr[],int i,int key){
        //base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        SearchKey(arr, i+1, key);
    }
//1947-input and output-one nine four seven
    public static void NumtoWords(int num,String words[]){
        if(num==0){
            return;
        }
        int lastdigit=num%10;
        NumtoWords(num/10, words);
        System.out.print(words[lastdigit]+ " ");
    
    }
//length of a string 
    public static void LengthOfStr(StringBuilder str,int i,int count){
        if(i==str.length()){
            System.out.println(count);
            return;
        }
        str.charAt(i);
        count++;
        LengthOfStr(str, i+1, count);
       
    }
    public static void main(String args[]){
        // String str="nnikhitha";
        // StringBuilder newstr=new StringBuilder("");
        // boolean map[]=new boolean[26];
        // RemoveDuplicates(str, newstr, 0, map);
     
        // System.out.println(FriendsPairing(4));
        //BinaryString(3, 0,"");
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // int key=2;
        // SearchKey(arr, 0, key);
        // int num=1947;
        // String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        // NumtoWords(num, words);
        StringBuilder str=new StringBuilder("nikitha");
        LengthOfStr(str, 0, 0);
        
    }
}