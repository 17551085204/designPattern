/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build.improve;
//import java.util.Scanner;

public abstract class HouseBuilder {
   House house=new House();
   // 抽象的建造流程
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    //建造房子,并返回
    public House buildHouse(){
        return house;
    }

}
