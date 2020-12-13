/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.proxy.dyproxy;
//import java.util.Scanner;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        System.out.println("老师在授课");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello,"+name);
    }
}
