package dp;

public class BookStatistics implements Visitor {
protected int paragraphsCount;
protected int tablesCount;
protected int imagesCount;
	@Override
	public void visit(Paragraph paragraph) {
		paragraphsCount++;
		
	}

	@Override
	public void visit(Table table) {
		tablesCount++;
		
	}

	@Override
	public void visit(Image image) {
		imagesCount++;
		
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		imagesCount++;
		
	}
	
	public void print() {
		System.out.println("***Number of images: " + imagesCount);
		System.out.println("***Number of tables: " + tablesCount);
		System.out.println("***Number of paragraphs: " + paragraphsCount);
	}
	

}
