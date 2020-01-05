package dp;

public class DeleteCommand implements Command {
	Memento memento = DocumentManager.getInstance().getMemento();

	@Override
	public void execute() {
		Book book = DocumentManager.getInstance().getBook();

		Section lastSection = book.getLastElement();
		memento.setState(lastSection);

		lastSection.remove(lastSection.getElements().size() - 1);
		DocumentManager.getInstance().addCommand(this);

	}

	@Override
	public void unexecute() {
		Book book = DocumentManager.getInstance().getBook();
		book.getElements().set(book.getElements().size() - 1, memento.getState());

	}

}
