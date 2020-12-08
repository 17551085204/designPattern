/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.simplefactory.order;
//import java.util.Scanner;

import designModel.creationtype.factory.simplefactory.pizza.ChessPizza;
import designModel.creationtype.factory.simplefactory.pizza.GreekPizza;
import designModel.creationtype.factory.simplefactory.pizza.PepperPizza;
import designModel.creationtype.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza=null;
        String orderType;// 订购pizza的类型
        do{
            orderType=getType();
            if(orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("greekpizza");
            }else if(orderType.equals("cheese")){
                pizza=new ChessPizza();
                pizza.setName("cheesepizza");
            }else if(orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("pepperpizza");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

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
