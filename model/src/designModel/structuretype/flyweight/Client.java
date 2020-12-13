/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.flyweight;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website site1 = websiteFactory.getWebsiteCategory("新闻");
        site1.use(new User("tom"));
        Website site2 = websiteFactory.getWebsiteCategory("博客");
        site2.use(new User("jack"));
        Website site3 = websiteFactory.getWebsiteCategory("博客");
        site3.use(new User("hello"));

        System.out.println("创建的网站数量:"+websiteFactory.getWebsiteCount());

    }



}
