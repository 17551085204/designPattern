/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.absfactory.pizza;
//import java.util.Scanner;

public abstract class Pizza {
    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }



}
