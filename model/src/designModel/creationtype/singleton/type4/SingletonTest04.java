/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true

    }

}

// 懒汉式，线程安全,同步方法

/**
 * 优缺点说明：
 *
 * 1)解决了线程安全问题
 * 2)效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3)结论：在实际开发中，不推荐使用这种方式
 *
 */


class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 类内部创建对象实例
    private static Singleton instance ;

    // 内部提供一个方法，使用到该方法时才创建对象
    // 加synchronized，解决线程不安全问题
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
