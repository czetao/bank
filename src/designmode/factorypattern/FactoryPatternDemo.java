package designmode.factorypattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShare("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShare("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShare("square");
        square.draw();
    }
}
