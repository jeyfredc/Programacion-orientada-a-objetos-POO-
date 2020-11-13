
class Main {
    
    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123", new Account("Jeyfred Calderon", "JCC1004"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();
        
        UberVan uberVan = new UberVan("FGH456", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}