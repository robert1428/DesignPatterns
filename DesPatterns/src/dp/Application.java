package dp;

public class Application {
	public static void main(String[] args) {
		// Book book = new Book("book 1");
		// Author author = new Author("author 1");
		// book.addAuthor(author);
		// Chapter chapter = new Chapter ("chapter 1");
		// Subchapter subchapter = new Subchapter("subchapter 1");
		// book.addChapter(chapter);
		// book.getChapterByIndex(0).addSubchapter(subchapter);
		// subchapter.addImage(new Image("image 1"));
		// subchapter.addParagraph(new Paragraph("paragraph 1"));
		// subchapter.addTable(new Table("Table 1"));
		// Chapter chapter2 = new Chapter("chapter 2");
		// book.addChapter(chapter2);
		// Subchapter subchapter2 = new Subchapter("Subchapter 2");
		// book.getChapterByIndex(1).addSubchapter(subchapter2);
		// book.print();

		// Book discoTitanic = new Book("Disco Titanic");
		// Author rpGheo = new Author("Radu Pavel Gheo");
		// discoTitanic.addAuthor(rpGheo);
		// int indexChapterOne = discoTitanic.addChapter("Capitolul 1");
		// Chapter chp1 = discoTitanic.getChapterByIndex(indexChapterOne);
		// int indexSubChapterOneOne = chp1.addSubchapter("Subcapitolul 1.1");
		//
		// Subchapter scOneOne =
		// chp1.getSubchapterByIndex(indexSubChapterOneOne);
		// scOneOne.addParagraph("Paragraph 1");
		// scOneOne.addParagraph("Paragraph 2");
		// scOneOne.addParagraph("Paragraph 3");
		// scOneOne.addImage("Image 1");
		// scOneOne.addParagraph("Paragraph 4");
		// scOneOne.addTable("Table 1");
		// scOneOne.addParagraph("Paragraph 5");
		// scOneOne.print();

		// Book book = new Book("book1");
		// book.addAuthor(new Author ("author 1"));
		// book.addContent(new Image ("image 1"));
		// book.addContent(new Paragraph("paragraph 1"));
		// book.addContent(new Table ("table 1"));
		// Section chapter = new Section("chapter1");
		// Section subchapter = new Section ("subchapter 1");
		// chapter.add(subchapter);
		// book.addContent(chapter);
		// book.print();

		// Book noapteBuna = new Book("Noapte buna, copii!");
		// Author rpGheo = new Author("Radu Pavel Gheo");
		// noapteBuna.addAuthor(rpGheo);
		// Section cap1 = new Section("Capitolul 1");
		// Section cap11 = new Section("Capitolul 1.1");
		// Section cap111 = new Section("Capitolul 1.1.1");
		// Section cap1111 = new Section("Subchapter 1.1.1.1");
		// noapteBuna.addContent(new Paragraph("Multumesc celor care au facut
		// posibila......"));
		// noapteBuna.addContent(cap1);
		//
		// cap1.add(new Paragraph("Moto capitol"));
		// cap1.add(cap11);
		// cap11.add(new Paragraph("Text from subchapter 1.1"));
		// cap11.add(cap111);
		// cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		// cap111.add(cap1111);
		// cap1111.add(new Image("Image subchapter 1.1.1.1"));
		// noapteBuna.print();

		//
		// long startTime = System.currentTimeMillis();
		// ImageProxy img1 = new ImageProxy("Pamela Anderson");
		// ImageProxy img2 = new ImageProxy("Kim Kardashian");
		// ImageProxy img3 = new ImageProxy("Kirby Griffin");
		// Section playboyS1 = new Section("Front Cover");
		// playboyS1.add(img1);
		// Section playboyS2 = new Section("Summer Girls");
		// playboyS2.add(img2);
		// playboyS2.add(img3);
		// Book playboy = new Book("Playboy");
		// playboy.addContent(playboyS1);
		// playboy.addContent(playboyS2);
		// long endTime = System.currentTimeMillis();
		// System.out.println("Creation of the content took " + (endTime -
		// startTime) + " milliseconds");
		// startTime = System.currentTimeMillis();
		// playboyS1.print();
		// endTime = System.currentTimeMillis();
		// System.out.println("Printing of the section 1 took " + (endTime -
		// startTime) + " milliseconds");
		// startTime = System.currentTimeMillis();
		// playboyS1.print();
		// endTime = System.currentTimeMillis();
		// System.out.println("Printing again the section 1 took " + (endTime -
		// startTime) + " milliseconds");
		//

		// Section cap1 = new Section("Capitolul 1");
		// Paragraph p1 = new Paragraph("Paragraph 1");
		// cap1.add(p1);
		// Paragraph p2 = new Paragraph("Paragraph 2");
		// cap1.add(p2);
		// Paragraph p3 = new Paragraph("Paragraph 3");
		// cap1.add(p3);
		// Paragraph p4 = new Paragraph("Paragraph 4");
		// cap1.add(p4);
		// System.out.println("Printing without Alignment");
		// System.out.println();
		// cap1.print();
		// p1.setAlignStrategy(new AlignCenter());
		// p2.setAlignStrategy(new AlignRight());
		// p3.setAlignStrategy(new AlignLeft());
		// System.out.println();
		// System.out.println("Printing with Alignment");
		// System.out.println();
		// cap1.print();

		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.print();

		FinancialBookVisitor bookVisitor = new FinancialBookVisitor();
		cap1.accept(bookVisitor);
		bookVisitor.print();

		System.out.println("***********************************************");
		Command command = new OpenCommand();
		command.execute();
		DocumentManager.getInstance().getBook().print();
		Command command1 = new StatisticsCommand();
		command1.execute();

	}
}
