/*
 * @Author hdk
 * @QQ:2890241339
 * @Date 2020/12/17 0017
 **/
package designModel.behaviortype.responsibilitychain;

public class PurchaseRequest {

    private int type;
    private double price;
    private int id;

    public PurchaseRequest(int type, double price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
