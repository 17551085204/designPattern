/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/11
*/

package designModel.structuretype.decorator;
//import java.util.Scanner;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2);

    }
}
