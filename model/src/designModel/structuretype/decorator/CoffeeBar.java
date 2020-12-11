/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/11
*/

package designModel.structuretype.decorator;
//import java.util.Scanner;

public class CoffeeBar {
    public static void main(String[] args) {
//        // 单品价格
//        Drink order = new LongBlackCoffee();
//        System.out.println("费用1="+order.cost());
//        System.out.println(order.getDes()+" "+order.getPrice());
//        // 加入一份牛奶
//        order=new Milk(order);
//        System.out.println("费用2="+order.cost());
//        System.out.println(order.getDes());
//        // 再加入一份巧克力
//        order=new Chocolate(order);
//        System.out.println("费用3="+order.cost());
//        System.out.println(order.getDes());
//        // 再加入一份巧克力
//        order=new Chocolate(order);
//        System.out.println("费用4="+order.cost());
//        System.out.println(order.getDes());


        // 对于扩展非常方便
        Drink order2 = new DecafCoffee();
        System.out.println(order2.cost());
        System.out.println(order2.getDes());

        order2=new Milk(order2);
        System.out.println(order2.cost());
        System.out.println(order2.getDes());

    }


}
