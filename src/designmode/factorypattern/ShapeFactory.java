package designmode.factorypattern;

/**
 * 工厂类
 */
public class ShapeFactory {

    // 使用getShare方法获取形状类型的对象
    public Shape getShare(String shareType){
        if (shareType == null){
            return null;
        }
        if (shareType.equals("circle")){
            return new Circle();
        }
        if (shareType.equals("rectangle")){
            return new Rectangle();
        }
        if (shareType.equals("square")){
            return new Square();
        }
        return null;
    }
}
