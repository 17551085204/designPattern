package designModel.creationtype.factory.absfactory.order;

import designModel.creationtype.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza = null;
        String orderType="";
        do {
            orderType = getType();
            pizza = this.absFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("pizza订购失败");
                break;
            }
        } while (true);
    }

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 类型:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
