public class AbstractExample {
public static void main(String []args)
   {
      Car car1 = new Ferrari();
      Carrepair carRepair = new Carrepair();
      carRepair.repairCar(car1);

      car1 = new Audi();
      carRepair.repairCar(car1);
   }
}
