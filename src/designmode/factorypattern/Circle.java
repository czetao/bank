package designmode.factorypattern;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("i am circle");
    }
}


class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("i am square");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("i am rectangle");
    }
}