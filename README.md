Scala CLI
---------
>Scala 3 CLI feature tests.

Script
------
1. scala-cli script.sc

Source
------
1. scala-cli compile app.scala
2. scala-cli run app.scala
3. scala-cli package app.scala -o app
4. ./app

Library
-------
1. scala-cli compile library.scala
2. scala-cli package library.scala -o library.jar --library

Test
----
1. scala-cli test . || scala-cli test unit.test.scala