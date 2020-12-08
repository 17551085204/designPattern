/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.simplefactory.improve.order;
//import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Or;

public class PizzaStore {
    // 相当于一个客户端，发起pizza订购
    public static void main(String[] args) {
       // 用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");



    }




}
