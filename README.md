# ibm-jdk-static-method-reproducer
Reproduces a probable bug in IBM JDK.

When having a structure ParentClass -> ChildClass, where each class contains a static method with the same name,
calling ChildClass.class.getMethods() returns methods which contains the static method from ParentClass and not
the static method from ChildClass. It should contain the static method from ChildClass.

Steps to reproduce: 
1. Clone this repository
2. Run mvn clean test
