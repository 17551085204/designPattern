/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.build.improve;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       // 盖普通房子
      CommonHouse commonHouse = new CommonHouse();
      HouseDirector houseDirector = new HouseDirector(commonHouse);
      House house = houseDirector.constructHouse();
      houseDirector.setHouseBuilder(new HighBuilding());
      House house2 =houseDirector.constructHouse();

    }


}
