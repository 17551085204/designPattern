/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true

    }

}

// 懒汉式，线程安全,同步代码块

/**
 * 这种不能保证线程安全，实际开发中不要使用
 *
 */


class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 类内部创建对象实例
    private static Singleton instance ;

    // 内部提供一个方法，使用到该方法时才创建对象
    public static  Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                instance=new Singleton();
            }
        }
        return instance;
    }

}
