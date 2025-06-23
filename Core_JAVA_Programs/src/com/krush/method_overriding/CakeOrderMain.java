package com.krush.method_overriding;



import java.util.Scanner;
 public  class CakeOrderMain{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   int choice = sc.nextInt();
   switch(choice){

       case 1: OrderedCake oc= new OrderedCake();
                System.out.println(oc);
                break;
       case 2: 
       String flavor =sc.next();
       String shape = sc.next(); 
       int quantity = sc.nextInt();
       
          oc= new OrderedCake(flavor,shape,quantity);

          
          System.out.println(oc);
         break;

         case 3:
       flavor =sc.next();
      shape = sc.next(); 
       quantity = sc.nextInt();
     String message=sc.nextLine();
     
       
       
          oc= new OrderedCake(shape,flavor,quantity,message);

          System.out.println(oc);
         break;

                 


   }

  }
}
//write the program show abstract method content concrete /generic / instance method.
abstract class Cake {
    private String  shape;
    private String flavor;
    private int quantity;
    public static double price=400;

          public Cake(String shape, String flavor, int quantity){          

           this.shape=shape;
           this.flavor=flavor;
           this.quantity=quantity;
               if(quantity<=0){
            System.out.println("Invalid input. All fields must be provided, and quantity must be > 0.");
            System.exit(0);
          }

          }



    public void setShape(String shape){
       this.shape=shape;

    }
public void setFlavor(String shape){
       this.flavor = flavor;

    }
    public void setQuantity(int quantity){
       this.quantity = quantity;

    }
        public String getShape(){
       return shape;

    }
public String getFlavor(){
   return  flavor;

    }
    public int getQuantity(){
   return quantity;

    }
     @Override
     public String toString(){

       return " A "+flavor+" "+shape+" Cake"+" Of "+quantity+" KG is Ready @ Rs."+quantity*price;
     }



}

class OrderedCake extends Cake{
   private String message;
       public OrderedCake(){
           super("Round","Vanila",1);
            
           //    System.out.println(this.toString());




       }
        public OrderedCake(String shape, String flavor, int quantity){
            super(shape,flavor,quantity);
           //   this.setFlavor(flavor);
           //   this.setQuantity(quantity);
           //   this.setShape(shape);
             

       }
         public OrderedCake(String shape, String flavor, int quantity,String message){
              super(shape,flavor,quantity);
           //   this.setFlavor(flavor);
           //   this.setQuantity(quantity);
           //   this.setShape(shape);
             
              this.message=message;
       }

        public String toString(){

            if(message==null){

               return super.toString();
            }else{
       return "A "+getShape()+" "+getFlavor()+" Cake Of "+getQuantity()+"KG is Ready with"+message+" message @ Rs."+getQuantity()*price;
            }
        }




}

