package designModel.behaviortype.observer.improve;

import designModel.behaviortype.observer.CurrentConditions;

import java.util.ArrayList;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者 对象集合
 * 3. 当数据有更新时，就主动的调用 list
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	private double temperatrue;
	private double pressure;
	private double humidity;

	// 观察者集合
    private ArrayList<Observer>observers;


	//加入新的第三方
	public WeatherData() {
		observers=new ArrayList<>();

	}

	public double getTemperature() {
		return temperatrue;
	}

	public double getPressure() {
		return pressure;
	}

	public double getHumidity() {
		return humidity;
	}

	public void dataChange() {
		notifyObservers();
	}

	//当数据有更新时，就调用 setData
	public void setData(double temperature, double pressure, double humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange， 将最新的信息 推送给 接入方 currentConditions
		dataChange();
	}

	// 注册一个观察者
	@Override
	public void registerObserver(Observer o) {
        observers.add(o);
	}

	// 移除一个观察者
	@Override
	public void removeObserver(Observer o) {
	    if(observers.contains(o)){
            observers.remove(o);
        }

	}

	// 遍历所有观察者，并通知
	@Override
	public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(getTemperature(),getPressure(),getHumidity());
        }

	}
}
