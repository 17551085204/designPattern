package designModel.creationtype.factory.factorymethod.order;


import designModel.creationtype.factory.factorymethod.pizza.LDCheesePizza;
import designModel.creationtype.factory.factorymethod.pizza.LDPepperPizza;
import designModel.creationtype.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
