<?php

require_once("car.php");
require_once("account.php");

$car = new Car("JRM45E", new Account("Jeyfred Calderon", "JCC1004"));
$car->printDataCar();

