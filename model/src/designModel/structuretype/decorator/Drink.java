/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/11
*/

package designModel.structuretype.decorator;
//import java.util.Scanner;

public abstract class Drink {
    public String des;
    private double price;

    // 计算费用
    // 子类实现
    public abstract double cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
