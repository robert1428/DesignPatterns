package dp;

public class ImageProxy implements Element, Observable {
	private String name;
	private Image image;

	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		if (image == null) {
			this.image = new Image(name);
		}

		image.print();

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
		// TODO Auto-generated method stub

	}

	@Override
	public void setNewValue(String value) {
		// TODO Auto-generated method stub

	}

}
