//blueprint
class Pen{
    String color;
    String type; 
    public void write()  // function or methods
    {
          System.out.println("writing somethings");
    }
    public void printcolor() {
    System.out.println(this.color);        
    }
}
 class Student {
     String name;
     int age;
     public void printinfo()
     {
         System.out.println(this.name);
         System.out.println(this.age);
    

     }
 }
// main function
public class OOPS {
//   public static void main(String[]args) {
//       Pen pen1 =new Pen(); // object
//       pen1.color="blue";
//       pen1.type="gel";

//       Pen pen2=new Pen();
//       pen2.color ="black";
//       pen2.type="ballpoint";

//       pen1.printcolor();
//       pen2.printcolor();
//     }  
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="paras";
    s1.age=22;

    s1.printinfo();
}

}
