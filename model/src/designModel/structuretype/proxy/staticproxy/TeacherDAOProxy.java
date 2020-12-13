/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.proxy.staticproxy;
//import java.util.Scanner;

public class TeacherDAOProxy implements ITeacherDAO {
    // 目标对象，通过接口来聚合
    ITeacherDAO teacherDAO;
    public TeacherDAOProxy(ITeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        teacherDAO.teach();
        System.out.println("代理结束");
    }
}
