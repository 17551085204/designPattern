/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build.improve;
//import java.util.Scanner;

public class HighBuilding extends HouseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("高楼打地基，20m");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
