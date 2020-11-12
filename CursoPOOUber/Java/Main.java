
class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Jeyfred Calderon", "JCC1004"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("JRM45E", new Account("Andrez Gonzalez", "ANDD123"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}