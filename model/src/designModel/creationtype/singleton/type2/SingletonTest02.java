/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true


    }

}

// 饿汉式, 静态代码块

/**
 * 优缺点说明：
 *
 * 1)这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * 2)结论：这种单例模式可用，但是可能造成内存浪费
 *
 */


class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 类内部创建对象实例
    private static Singleton instance ;
    static {
        instance=new Singleton();
    }

    // 内部提供一个方法
    public static Singleton getInstance(){
        return instance;
    }


}