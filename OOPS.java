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

// main function
public class OOPS {
  public static void main(String[]args) {
      Pen pen1 =new Pen(); // object
      pen1.color="blue";
      pen1.type="gel";

      Pen pen2=new Pen();
      pen2.color ="black";
      pen2.type="ballpoint";

      pen1.printcolor();
      pen2.printcolor();
    }  
}
