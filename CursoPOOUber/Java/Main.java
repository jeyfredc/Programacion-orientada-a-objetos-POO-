
class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "jeyfred Calderon";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license="JRM45E";
        car2.driver="Andres Gonzalez";
        car2.passenger = 3;
        car2.printDataCar();
    }
}