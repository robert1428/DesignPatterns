package dp;

import java.util.Stack;

public class DocumentManager {
	private static DocumentManager documentManager;
	private Book book;
	private Memento memento = new Memento();
	private FirstObserver firstObserver = new FirstObserver();
	Stack<Command> commands = new Stack<>();

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	private DocumentManager() {

	}

	public void addCommand(Command command) {
		commands.push(command);
	}

	public Command getLastCommand() {
		return commands.pop();
	}

	public Observer getFirstObserver() {
		return firstObserver;

	}

	public Memento getMemento() {
		return memento;
	}

	public static DocumentManager getInstance() {
		if (documentManager == null) {
			documentManager = new DocumentManager();
		}

		return documentManager;

	}

}
