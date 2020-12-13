/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.proxy.staticproxy;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ITeacherDAO proxy = new TeacherDAOProxy(new TeacherDAO());
        proxy.teach();

    }

}
