public class Functions3{
//binary to decimal number
    public static void bintodec(int binNum){
        int MyNum=binNum;
        int pow=0;
        int dec=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal conversion of "+MyNum + " is"+dec);
    }
    //decimal to binary
    public static void DecToBin(int DecNum){
        int pow=0;
        int Num= DecNum;
        int BinNum=0;
        while(DecNum>0){
            int reminder = DecNum%2;
            BinNum = BinNum+(reminder*(int)Math.pow(10,pow));
            DecNum = DecNum/2;
        }
        System.out.println("the Binary form of " + Num+" is "+BinNum);
    }
    //average of 3 num
    public static void avg(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
    //even or odd
    public static boolean isEven(int a){
        boolean isEven=true;
        if(a%2==0){
            return isEven;
        }
        else{
            return false;
        }
        
    }
    /* JavaprogramtocheckifanumberisapalindromeinJava
    A numberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321
     */
    public static void isPalindrome(int num){
        int MyNum=num;
        int rev=0;
        while(num>0){
            int lastdigit=num%10;
            rev = (rev*10)+lastdigit;
            num=num/10;
        }
        if(MyNum==rev){
            System.out.println(MyNum+"is a palindrome");
        }
    }
    //sum of the digits in an integer
    public static void SumofDigits(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        //int binNum=111;
        //int DecNum=7;
        //DecToBin(DecNum);
        //bintodec(binNum);
        //int a=3;
        //int b = 29;
        //int c =4;
        //avg(a,b,c);
        //int a = 33;
        //System.out.println(isEven(a));
        //int num=121;
        //isPalindrome(num);
        int n =154;
        SumofDigits(n);
    }
}