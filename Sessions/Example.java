package Sessions;
public class Example{
    public static void main(String[] args){
        Car mycar=new Car();
        mycar.car(100,"per hr");
        //int sol=Car.car1(100);    //for this we need "static"
        //System.out.println(sol);
        System.out.println(mycar.s+" "+mycar.sp);

        //mycar.car1(100);          //for this line dont need "static"
        // System.out.println(mycar.s);
        
}
}
class Car{
    int s;String sp;
    public void car(int s, String sp){
         this.s=s;
         this.sp=sp;
        System.out.println("Speed of car is "+s+" "+sp);  
    }
    public static int car1(int s){   //ststic or may not based on the main.
        return s;
    }
}


