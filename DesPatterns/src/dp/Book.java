package dp;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList();
	private List<Element> elements = new ArrayList<Element>();

	public Book(String title) {
		this.title = title;
	}

	public List<Element> getElements() {
		return elements;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(Author author) {

		authors.add(author);

	}

	public void addContent(Element element) {
		elements.add(element);
	}

	public Element getElement(int index) {
		return elements.get(index);
	}

	public void print() {
		System.out.println("Book: " + title);
		for (Author author : authors) {
			author.print();
		}
		for (Element element : elements) {
			element.print();
		}
	}

	public Section getLastElement() {
		for (int i = elements.size() - 1; i >= 0; i++) {
			if (elements.get(i) instanceof Section) {
				return (Section) elements.get(i);
			}

		}
		return null;

	}

}
