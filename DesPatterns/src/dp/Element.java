package dp;

public interface Element {
	public void print();

	public void accept(Visitor visitor);

	public void setNewValue(String value);

}
