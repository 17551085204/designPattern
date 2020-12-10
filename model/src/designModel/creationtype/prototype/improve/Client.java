/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.prototype.improve;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("tom2",12,"白色");
        sheep.friend=new Sheep("jack",12,"白色");
        Sheep sheep2=(Sheep)sheep.clone();
        Sheep sheep3=(Sheep)sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep.friend==sheep3.friend);//true
        /**
         * 1)对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
         * 2)对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，
         * 也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。
         * 因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，
         * 在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
         */


    }

}
