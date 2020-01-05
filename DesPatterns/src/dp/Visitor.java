package dp;

public interface Visitor {
	public void visit (Paragraph paragraph);
	public void visit (Table table);
	public void visit (Image image);
	public void visit (ImageProxy imageProxy);

}
