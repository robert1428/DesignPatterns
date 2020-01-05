package dp;

public class FinancialBookVisitor extends BookStatistics  {
	public static final int IMAGE_COST = 10;
	public static final int PARAGRAPH_COST = 5;
	public static final int TABLE_COST = 2;

	
	public void print() {
		//computeTotalCost();
		int imagesCost = imagesCount * IMAGE_COST;
		System.out.println("COST OF IMAGES: " + imagesCost );
		int paragraphsCost = paragraphsCount * PARAGRAPH_COST;
		System.out.println("COST OF PARAGRAPHS: " + paragraphsCost);
		int tablesCost = tablesCount * TABLE_COST;
		System.out.println("COST OF TABLES: " + tablesCost);
		int totalCost = paragraphsCost + tablesCost + imagesCost;
		System.out.println("TOTAL COST: " + totalCost);
	}

}
