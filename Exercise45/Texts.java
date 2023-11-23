package Exercise45;

public class Texts extends AGallery{
	private int numberOfLines;
/**
 * this is constructor of class Texts. There are 3 field
 * @param nameForSourceFile
 * @param sizes
 * example:
 * 	new Texts("welcome.txt", 5.312, 830);
 */
	public Texts(String nameForSourceFile, double sizes, int numberOfLines) {
		super(nameForSourceFile, sizes);
		this.numberOfLines = numberOfLines;
	}
}
