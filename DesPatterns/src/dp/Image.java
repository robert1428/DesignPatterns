package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Observable {
	private String name;
	private String newValue;
	private String oldValue;
	private List<Observer> observersList = new ArrayList<>();

	@Override
	public String toString() {
		return "Image [name=" + name + "]";
	}

	public Image(String name) {
		super();
		this.name = name;
		this.newValue = name;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("Image: " + name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void addObserver(Observer observer) {
		observersList.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observersList.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observersList) {
			observer.update(oldValue, newValue);
		}

	}

	@Override
	public void setNewValue(String value) {
		this.oldValue = this.newValue;
		this.newValue = value;

	}

}
