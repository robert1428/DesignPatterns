package dp;

public class Author {
	private String name;

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

	public Author(String name) {
		super();
		this.name = name;
	}
	
	public void print() {
		System.out.println("Author: "+name);
	}

}
