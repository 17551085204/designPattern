package principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("汽车");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
	}

}

// 遵守了单一职责原则，但是这样改动很大，需要将类分解
// 可以直接改动Vehicle类
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在陆地上跑");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在空中飞");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在水中运行");
	}
}