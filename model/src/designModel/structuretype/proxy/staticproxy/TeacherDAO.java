/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.proxy.staticproxy;
//import java.util.Scanner;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}
