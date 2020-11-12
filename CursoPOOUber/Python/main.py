from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("JRM45E", Account("Jeyfred Calderon", "JCC1004"))
    print(vars(car))
    print(vars(car.driver))
