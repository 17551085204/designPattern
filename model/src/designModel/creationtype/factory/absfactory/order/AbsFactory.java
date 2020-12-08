package designModel.creationtype.factory.absfactory.order;

import designModel.creationtype.factory.absfactory.pizza.Pizza;

// 抽象层
public interface AbsFactory {
    public Pizza createPizza(String OrderType);

}
