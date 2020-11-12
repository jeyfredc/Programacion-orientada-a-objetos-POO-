
class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Jeyfred Calderon", "JCC1004"), "Chevrolet", "Spark");
        uberX.passenger = 3;
        uberX.printDataCar();

        /* Car car2 = new Car("JRM45E", new Account("Andrez Gonzalez", "ANDD123"));
        car2.passenger = 3;
        car2.printDataCar(); */
    }
}