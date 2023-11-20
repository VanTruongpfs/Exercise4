package Exercise42;

public abstract class ARecords implements IRecords {
	protected String nameForSourceFile;
	protected double sizes;
/**
 * this is a constructor of class Abstract ARecords. There are 2 field
 * @param nameForSourceFile
 * @param sizes
 * exanple:
 * 	ARecords a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
 * 	ARecords a2 = new Sounds("theme.mp3", 40.960, 200);
 * 	ARecords a3 = new Texts("welcome.txt", 5.312, 830);
 */
	public ARecords(String nameForSourceFile, double sizes) {
		this.nameForSourceFile = nameForSourceFile;
		this.sizes = sizes;
	}
}


