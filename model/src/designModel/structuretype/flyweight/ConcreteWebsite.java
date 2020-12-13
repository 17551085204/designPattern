/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.flyweight;
//import java.util.Scanner;

public class ConcreteWebsite extends Website {

    private String type="";// 网站发布的类型

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:"+type+",使用者是"+user.getName());
    }
}
