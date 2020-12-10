/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build.improve;
//import java.util.Scanner;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基，5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
