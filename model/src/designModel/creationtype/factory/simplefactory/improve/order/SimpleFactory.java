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

public class SimpleFactory {

    //根据orderType返回对应的pizza实例
   public Pizza createPizza(String orderType){
       System.out.println("使用简单工厂模式");
       Pizza pizza=null;
       if(orderType.equals("greek")){
           pizza=new GreekPizza();
           pizza.setName("greekpizza");
       }else if(orderType.equals("cheese")){
           pizza=new ChessPizza();
           pizza.setName("cheesepizza");
       }else if(orderType.equals("pepper")){
           pizza=new PepperPizza();
           pizza.setName("pepperpizza");
       }
       return pizza;
   }


}
