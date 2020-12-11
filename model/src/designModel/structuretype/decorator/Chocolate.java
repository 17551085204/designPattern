/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/11
*/

package designModel.structuretype.decorator;
//import java.util.Scanner;

public class Chocolate extends  Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(1);// 调味品的价格
    }

}
