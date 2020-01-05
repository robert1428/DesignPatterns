package dp;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Observable {
	private String title;
	private String value;
	private String oldValue;
	private List<Element> elements = new ArrayList<>();
	private List<Observer> observersList = new ArrayList<>();

	public Section(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public void print() {
		System.out.println("Title: " + title);
		System.out.println("Content: ");
		for (Element element : elements) {
			element.print();
		}

	}

	public int add(Element element) {
		elements.add(element);
		return elements.size() - 1;
	}

	public void remove(Element element) {
		elements.remove(element);
	}

	public Element getElementByIndex(int index) {
		return elements.get(index);
	}

	@Override
	public void accept(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}

	@Override
	public void addObserver(Observer observer) {
		observersList.add(observer);
	}

	@Override
	public void removeObserver(Observer obeserver) {
		observersList.remove(obeserver);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observersList) {
			observer.update(oldValue, title);
		}

	}

	@Override
	public void setNewValue(String value) {
		this.oldValue = this.title;
		this.title = value;

	}

	public List<Element> getElements() {
		return elements;
	}

	public void remove(int i) {
		elements.remove(i);

	}

}
