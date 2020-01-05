package dp;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element, Observable {
	private String name;
	private AlignStrategy alignStrategy;
	private String newValue;
	private String oldValue;
	private List<Observer> observersList = new ArrayList<>();

	public AlignStrategy getAlignStrategy() {
		return alignStrategy;
	}

	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.alignStrategy = alignStrategy;
	}

	@Override
	public String toString() {
		return "Paragraph [name=" + name + "]";
	}

	public Paragraph(String name) {
		super();
		this.name = name;
		this.newValue = name;
	}

	@Override
	public void print() {
		if (alignStrategy != null) {
			alignStrategy.print(name);
			return;
		}
		System.out.println(name);
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
