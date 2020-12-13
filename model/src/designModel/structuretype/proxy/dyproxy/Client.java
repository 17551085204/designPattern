/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.proxy.dyproxy;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ITeacherDAO proxyInstance =(ITeacherDAO )new ProxyFactory(new TeacherDAO()).getProxyInstance();
        proxyInstance.teach();
        System.out.println("----------------------");
        proxyInstance.sayHello("tom");

    }




}
