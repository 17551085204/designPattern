/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.absfactory.pizza;
//import java.util.Scanner;

public class BJCheesePizza extends Pizza {


    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
