/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        /**
         * 优点是比较好理解，简单易操作。
         * 2)设计的程序结构，过于简单，没有设计缓存层对象，程序的扩展和维护不好.
         * 也就是说，这种设计方案，把产品(即：房子) 和 创建产品的过程(即：建房子流程) 封装在一起，
         * 耦合性增强了。
         * 3)解决方案：将产品和产品建造过程解耦  =>	建造者模式.
         */
        new CommonHouse().build();


    }

}
