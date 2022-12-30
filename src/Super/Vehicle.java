package Super;

//super is called a refrence variable
// it refers to the superclass in a inheritance
//relationship
 class Vehicle {

     int maxSpeed = 0;
   public void vroom(){
       System.out.println("Vroom Vroom");
   }
}
class Car extends Vehicle{

   //We can use super to access the data, what will be displayed
    //is the initial variable.
   //  int maxSpeed = 125;
     public void displaySpeed(){
         System.out.println(super.maxSpeed);
     }
    @Override
    public void vroom() {
        super.vroom();
    }
}
