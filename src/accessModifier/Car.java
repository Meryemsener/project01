package accessModifier;

public class Car {
   private int enginePower,model;//alt sinif dahil baska kimse erisemez
   public int speed;//butun siniflar erisebilir
   protected String colour;//alt siniflar ve ayni pakettekiler erisebilir

   Car(){
       this.model=2020;
       this.enginePower = enginePower;
       this.speed=speed;
       this.colour="white";
   }
   public void print() {
       System.out.println(model);
   }
   public void run(){
       print();
   }

}
