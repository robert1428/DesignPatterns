package dp;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element, Observable {
	private String name;
	private String newValue;
	private String oldValue;
	private List<Observer> observersList = new ArrayList<>();

	public Table(String name) {
		super();
		this.name = name;
		this.newValue = name;
	}

	@Override
	public String toString() {
		return "Table [name=" + name + "]";
	}

	@Override
	public void print() {
		System.out.println("Table: " + name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer obeserver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {

	}

	@Override
	public void setNewValue(String value) {
		this.oldValue = this.newValue;
		this.newValue = value;

	}

}
