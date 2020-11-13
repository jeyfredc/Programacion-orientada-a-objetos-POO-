import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }
    
   @Override 
   public void setPassenger(Integer passenger) {
       if(passenger == 6){
           this.passenger = passenger;
       }
       else{
           System.out.println("Necesitas asignar 6 pasajeros");
       }
   }
   
   @Override
   void printDataCar(){
       System.out.println("License: " + license + " Driver: " + driver.name + " Passenger: " + passenger);

   }
   
}
