<?php

require_once("Car.php");
require_once("Account.php");

$car = new Car("JRM45E", new Account("Jeyfred Calderon", "JCC1004"));
$car->printDataCar();

