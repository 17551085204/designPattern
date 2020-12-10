/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.prototype;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // 传统方法
        /**
         * 1)优点是比较好理解，简单易操作。
         * 2)在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
         * 3)总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活
         *
         */
        Sheep sheep=new Sheep("tom",12,"白色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);


    }

}
