/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.structuretype.flyweight;
//import java.util.Scanner;

import java.util.HashMap;

// 根据需求，返回一个具体的网站
public class WebsiteFactory {
    HashMap<String,ConcreteWebsite>pool=new HashMap<>();
    //根据网站类型，返回一个网站，如果没有就创建一个网站，并放入池中
    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        // 类型转一下，方便使用
        return (Website)pool.get(type);

    }

    //得到网站的数量
    public int getWebsiteCount(){
        return pool.size();
    }


}
