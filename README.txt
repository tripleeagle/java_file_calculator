The Java File Calculator

The text description of the task is located in Java_Technical_Test.pdf

Usage:
   Run Main and write a file path
   Also, the usage of the program is shown in tests: test/eu/cz/lyalival/MainTest

Note:
  Each operation in the filePath must be separated by \n.
  The file could only contain one block of operations. (in other words only one "apply")
  The program handles addition, subtraction, multiplication, division
  To add another binary operation, add the operation and implement interface Operation. Don't forget to add it in OperationFactory.

To create a jar use maven -> Plugins -> assembly:single
