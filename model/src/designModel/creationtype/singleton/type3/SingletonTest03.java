/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);//true

    }

}

// 懒汉式，线程不安全

/**
 * 优缺点说明：
 *
 * 1)起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 * 2)如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 * 3)结论：在实际开发中，不要使用这种方式.
 *
 */


class Singleton{
    // 外部不可以new 对象
    private Singleton(){}
    // 类内部创建对象实例
    private static Singleton instance ;

    // 内部提供一个方法，使用到该方法时才创建对象
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
