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

Library
-------
1. scala-cli compile library.scala

Test
----
1. scala-cli test . || scala-cli test unit.test.scala

Package
-------
>Source file:
1. scala-cli package app.scala -o app
>Library file:
1. scala-cli package library.scala -o library.jar --library

Run
---
>After packaging app.scala:
1. ./app