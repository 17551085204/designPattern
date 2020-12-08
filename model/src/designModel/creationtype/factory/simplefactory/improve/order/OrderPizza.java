/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.simplefactory.improve.order;
//import java.util.Scanner;

import designModel.creationtype.factory.simplefactory.improve.pizza.ChessPizza;
import designModel.creationtype.factory.simplefactory.improve.pizza.GreekPizza;
import designModel.creationtype.factory.simplefactory.improve.pizza.PepperPizza;
import designModel.creationtype.factory.simplefactory.improve.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    // 聚合关系
    SimpleFactory simpleFactory=null;
    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType="";
        this.simpleFactory=simpleFactory;

        do{
            orderType=getType();
            pizza=simpleFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购pizza失败");
                break;
            }

        }while (true);

    }


    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
