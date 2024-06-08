import java.util.*;
public class Strings {
    
    //char at method
    public static void printletters(String name){
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
    
    //checking if a string is palindrome---O(n)
    public static boolean isPalindrome(String str){
       int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("false");
                return false;
            }
       }
       System.out.println("true");
       return true;
    }

    //shortest path---O(n)
    public static float shortestPath(String path){
        int x=0;int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    //lexicographically---largest among the strings---O(N*X)
    public static void LargestString(String countries[]){
        String largest=countries[0];
        for(int i=1;i<countries.length;i++){
            if(largest.compareTo(countries[i])<0){
                largest=countries[i];
            }
        }
        System.out.println(largest);
    }

    //converting first letter of word to upper case---O(n)
    public static String ToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String args[]){
        
        //input
       /*  Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);

        //length
        System.out.println(str.length());*/

        /*concatination
        String str1="naga";
        String str2="nikhihta";
        String name=str1+str2;
        System.out.println(name);*/

        //characted at an index in string
       // System.out.println(name.charAt(7));
        //String str="java programming language .";
        //System.out.println(ToUpperCase(str));
        //isPalindrome(str);
        //String path="WNEESWENS";
       //System.out.println(shortestPath(path)); 
       //String countries[]={"india","pakisthan","australia","oman"};
       //LargestString(countries);
       String person = new String ("vijay");
       int value = person.length();
       System.out.println(value);
       String uString = person.toUpperCase();
       System.out.println(uString);
        
        
    }
}
