package dp;

public class StatisticsCommand implements Command {

	@Override
	public void execute() {
		Book book = DocumentManager.getInstance().getBook();
		BookStatistics bookStatistics = new BookStatistics();
		Section section = (Section) book.getElement(0);
		section.accept(bookStatistics);
		bookStatistics.print();

	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub

	}

}
