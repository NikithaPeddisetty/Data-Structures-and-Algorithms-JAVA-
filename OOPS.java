public class OOPS{
    public static void main(String args[]){
        // Pen p1=new Pen();//created a pen object 
        // p1.setColor("Multicolor");
        // System.out.println(p1.color);
        // p1.tip=5;
        // System.out.println(p1.tip);
        // BankAccount myacc= new BankAccount();
        // myacc.username="nikitha";
        // myacc.setPass("micky mouse");
        // System.out.println(myacc.getPass());
      // Student s1=new Student();
       
    //     s1.name="nikki";
    //     s1.roll_no=123;
    //     s1.marks=new int[3];
    //     s1.marks[0]=89;
    //     s1.marks[1]=100;
    //     s1.marks[2]=79;
        
    //     Student s2 = new Student(s1);
    //    System.out.println(s2.name);
    //    s1.marks[2]=99;
    //    for(int i=0;i<3;i++){
    //     System.out.println(s2.marks[i]);
    //    }
    // Scooter Honda=new Scooter();
    // Honda.year=2001;
    // Honda.engine();
    // Honda.local();
    // Human Nikki= new Human();
    // Nikki.eats();
    // Nikki.hands=2;
    // Tuna sheero = new Tuna();
    // sheero.fin=2;
    // Calculator c= new Calculator();
    // System.out.println(c.sum(4,55));
    // System.out.println(c.sum((float)2.3,(float)7.8));
    // System.out.println(c.sum(2,3,1));
    // Animal monkey =new Animal();
    // monkey.eat();
//     Horse h = new Horse();
//     h.changecolor();
//     h.eat();
//     chicken c = new chicken();
//     c.walk();
//    System.out.println(c.color);
        // Beer b = new Beer();
        // b.eatsGrass();
        // b.eatsMeat();
        School s1 = new School();
        s1.stuName="Nikitha";
        School.schName="kkr";
        System.out.println(School.schName);
        School.percentage(34, 67, 100);
        //s1.schName="Sri Chaithanya";
        // s1.percentage(90, 89, 100);
        // School s2 = new School();
        // System.out.println(s2.schName);
        // s2.percentage(23, 34, 54);
        
        


    }
}
//create a class pen
class Pen{
    //attributes+fnx
    //this is the blueprint of creating and exploiting..here we are creating pen so pen has properties like color and tip size,and fnx we can apply on our pen like changing color and tip size
    //properties of pen..
    String color;
    int tip;
    //fuctions /methods that can be applied on pen
    void setColor(String newColor){
        color=newColor;//assigning new color 
        
    }
    void setTip(int newTip){
        tip=newTip;
        
    }
}

//access modifiers and getters,setters
class BankAccount{
    public String username;
    private String Password;
    //get the password
    String getPass(){
        return this.Password;
    }
    void setPass(String Password){
        this.Password=Password;
    }
    String getName(){
        return this.username;
    }
    void setName(String username){
        this.username=username;
    }
    
} 

//constructor--a special methos which is invoked automatically when obj is created
class Student{
    String name;
    int roll_no;
    int marks[];
    // parameterized constructor
    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        
    }
    //non-parameterized constructor
    Student(){
        System.out.println("java programming");
    }
    // shallow copy constructor
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll_no=s1.roll_no;
    //     this.marks=s1.marks;
    // }
    
    //deep copy constructor
    Student(Student s1){
     marks=new int[3];
     this.name=s1.name;
     this.roll_no=s1.roll_no;
    for(int i=0;i<3;i++){
        this.marks[i]=s1.marks[i];
    }
    }
}
//inheritance---properties and models of base class are passed to derived class
//1.single level inheritance
class Vehicles{
    String name;
    int year;
    String model;
    void moves(){
        System.out.println("vehicle is used for transportation ");
    }
}
class twoWheeler extends Vehicles{
   
    void local(){
        System.out.println(" two wheeler is basically used for local travelling");
    }
}

//2.multi level inheritance
class Scooter extends twoWheeler{
  
    void engine(){
        System.out.println("scooters are petrol fueled engines");
    }
}
//3.hierarchial inheritance

class FourWheeler extends Vehicles{
    void engine(){
        System.out.println("cars are diesel fueled engines");
    }
}
//4.hybrid inheritance
class Animals{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
class SeaAnimal extends Animals{
    int fin;
    void swims(){
        System.out.println("sea animals can swim");
    }
}
class Bird extends Animals{
    String color;
    void fly(){
        System.out.println("birds can fly");
    }
}
class Mammal extends Animals{
    String legs;
    void walk(){
        System.out.println("Mammals can walk");
    }
}
class Tuna extends SeaAnimal{
    void food(){
        System.out.println("tuna eats squids");
    }
}
class Human extends Mammal{
    int hands;
    void bath(){
        System.out.println("humans take bath ");
    }
}

//polymorphism
//1.metho overloading---same fnx name but diff types of attributes
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

//2.method overriding---same fnx name but diff def
class Animal{
    void eat(){
        System.out.println("animals eat everthings");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats grass");
    }
}

//Abstraction
abstract class animal{
    String color;
    animal(){
        color="brown";
        System.out.println("animal constructer created");
    }
    void eat(){
        System.out.println("all animals eat");
    }
    abstract void walk();//just giving the idea but not implimenting
}
class Horse extends animal{
    String color;
    Horse(){
        System.out.println("horse constructer created");
    }
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class chicken extends animal{
    chicken(){
        System.out.println("chicken constructer created");
    }
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}

/*interfaces--
multiple interfaces*/
interface Harbivore{
    void eatsGrass();
        //abstract methods do not have body because abstraction is just giving an idea but not implementing it
}
interface Carnivore{
    void eatsMeat();
}
class Beer implements Harbivore,Carnivore{
    public void eatsGrass(){
        System.out.print("beer eats grass ");
    }
    public void eatsMeat(){
        System.out.println("as well as meat");
    }
}

//static keyword
class School{
    String stuName;
    int Roll;
    static String schName;
    static int percentage(int maths,int phy,int chem){
       System.out.println((maths+phy+chem)/3);
        return (maths+phy+chem)/3;
    }
    void setDetails(String stuName,int Roll){
        this.stuName=stuName;
        this.Roll=Roll;
       
    }
    String getName(){
        return stuName;
    }
    int getRoll(){
        return Roll;
    }
}

//complex numbers add,sub,product
class Complex{
    int real;
    int imaginary;
Complex(int r,int i){
    real=r;
    imaginary=i;
}
void DisplayComplex(){
    System.out.println("the real part is "+ real + "imaginary part is "+imaginary);
}
public static Complex add(Complex a,Complex b){
return 
}
}

