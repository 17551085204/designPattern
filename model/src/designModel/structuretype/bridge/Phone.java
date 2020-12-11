/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.structuretype.bridge;

public abstract class Phone {
   Brand brand ;
    // 构造器实现组合
    public Phone(Brand brand) {
        this.brand = brand;
    }

    void open(){
        this.brand.open();
    }
    void close(){
        this.brand.close();
    }
    void call(){
        this.brand.call();
    }
}
