from car import Car

if __name__ == "__main__":
    print("Hola mundo")

    car = Car()
    car.license = "JRM45E"
    car.driver = "Jeyfred Calderon"
    print(vars(car))

    car2 =Car()
    car2.license = "AMQ123"
    car2.driver= "Andres Gonzalez"
    print(vars(car2))