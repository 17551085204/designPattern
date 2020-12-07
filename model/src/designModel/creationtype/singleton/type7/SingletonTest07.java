/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true

    }

}

//静态内部类

/**
 * 优缺点说明：
 *
 * 1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 2)静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
 * 3)类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4)优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5)结论：推荐使用.
 */

class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 静态内部类，该类有一个静态属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();

    }

    // 内部提供一个方法
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}



