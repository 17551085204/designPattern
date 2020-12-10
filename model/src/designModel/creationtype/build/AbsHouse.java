/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build;
//import java.util.Scanner;

public  abstract class AbsHouse {
    public  abstract void buildBasic();
    public  abstract void buildWall();
    public  abstract void roofed();

    public   void build(){
        buildBasic();
        buildWall();
        roofed();
    }

}
