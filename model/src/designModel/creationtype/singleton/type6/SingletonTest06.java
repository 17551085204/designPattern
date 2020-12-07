/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true

    }

}

//双重检查

/**
 * 优缺点说明：
 *
 * 1)Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。
 * 2)这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步。
 * 3)线程安全；延迟加载；效率较高
 * 4)结论：在实际开发中，推荐使用这种单例设计模式
 *
 */


class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 类内部创建对象实例
    private static volatile Singleton instance ;

    // 内部提供一个方法，使用到该方法时才创建对象
    public static Singleton getInstance(){
        if(instance==null){
            // 双重检查
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}



