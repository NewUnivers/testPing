package fr.epita.assistants;

import fr.epita.assistants.helloworld.HelloWorld;
public class Main {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.printHelloWorld();
        hello.printHelloWorldErr();
    }
}