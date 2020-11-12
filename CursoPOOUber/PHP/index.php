<?php

require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("JRM45E ", new Account("Jeyfred Calderon", "JCC1004"), "Chevrolet", "Spark");
$uberX -> printDataCar();

echo "<br>";

$uberPool = new UberPool("AMQ123 ", new Account("Andrez Gonzalez", "ANDD123"), "Dodge", "Attitude");
$uberPool -> printDataCar();