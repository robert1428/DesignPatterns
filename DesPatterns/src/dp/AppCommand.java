package dp;

public class AppCommand {

	public static void main(String[] args) {
		Book book = new Book("book 1");

		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(new Paragraph("Another One"));
		cap1.add(new Paragraph("Another Two"));
		cap1.add(new Paragraph("Another Three"));
		book.addContent(cap1);
		DocumentManager.getInstance().setBook(book);

		DeleteCommand deleteCommand = new DeleteCommand();
		deleteCommand.execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getBook().print();
		deleteCommand.execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getBook().print();

		Command undoCommand = new UndoCommand();
		deleteCommand.unexecute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getBook().print();
		deleteCommand.unexecute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getBook().print();
	}
}
