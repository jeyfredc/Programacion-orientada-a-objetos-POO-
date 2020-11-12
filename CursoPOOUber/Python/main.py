from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("JRM45E", Account("Jeyfred Calderon", "JCC1004"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AMQ123", Account("Andres Gonzalez", "ANDD123"), "Dodge", "Attitude")
    print(vars(uberX))
    print(vars(uberX.driver))