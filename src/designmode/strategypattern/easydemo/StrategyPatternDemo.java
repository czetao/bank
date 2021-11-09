package designmode.strategypattern.easydemo;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        StrategyCommon strategyAdd = new StrategyCommon(new OperationAdd());
        StrategyCommon strategyMultiply = new StrategyCommon(new OperationMultiply());
        StrategyCommon strategySubstratct = new StrategyCommon(new OperationSubstratct());

        int num1 = 4;
        int num2 = 5;
        System.out.println(strategyAdd.doOperation(num1,num2));
        System.out.println(strategyMultiply.doOperation(num1,num2));
        System.out.println(strategySubstratct.doOperation(num1,num2));
    }
}
