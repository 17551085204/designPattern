package designModel.creationtype.factory.factorymethod.order;


import designModel.creationtype.factory.factorymethod.pizza.BJCheesePizza;
import designModel.creationtype.factory.factorymethod.pizza.BJPepperPizza;
import designModel.creationtype.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
