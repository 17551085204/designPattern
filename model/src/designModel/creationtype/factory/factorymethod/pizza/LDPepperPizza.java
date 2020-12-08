/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/8
*/

package designModel.creationtype.factory.factorymethod.pizza;
//import java.util.Scanner;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备原材料");
    }


}
