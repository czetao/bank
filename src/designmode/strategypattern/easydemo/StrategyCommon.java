package designmode.strategypattern.easydemo;

/**
 * 策略模式实现工具类
 */
public class StrategyCommon {

    private Strategy strategy;

    public StrategyCommon(Strategy strategy){
        this.strategy = strategy;
    }

    public int doOperation(int num1,int num2){
        return this.strategy.doOperation(num1,num2);
    }

}
