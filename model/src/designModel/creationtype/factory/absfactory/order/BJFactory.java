/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.absfactory.order;
//import java.util.Scanner;

import designModel.creationtype.factory.absfactory.pizza.BJCheesePizza;
import designModel.creationtype.factory.absfactory.pizza.BJPepperPizza;
import designModel.creationtype.factory.absfactory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;

    }
}
