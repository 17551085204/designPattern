/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.structuretype.adapter.objadapter;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       Phone phone = new Phone();
       phone.charging(new VolAdapter(new Vol220V()));

    }
}
