/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/11
*/

package designModel.structuretype.decorator;
//import java.util.Scanner;

public class Decorator extends Drink{
    private Drink obj;// 组合关系
    @Override
    public double cost() {
        //调料自己的价格+单品coffee的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        // 输出被装饰者的信息
        return super.getDes()+" "+super.getPrice()+"&&"+obj.getDes()+" "+obj.getPrice();
    }

    public Decorator(Drink obj) {
        this.obj = obj;
    }
}
