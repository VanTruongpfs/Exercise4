package Exercise42;

public abstract class AGallery implements IGallery {
	protected String nameForSourceFile;
	protected double sizes;
/**
 * this is a constructor of class Abstract AGallery. There are 2 field
 * @param nameForSourceFile
 * @param sizes
 * exanple:
 * 	AGallery a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
 * 	AGallery a2 = new Sounds("theme.mp3", 40.960, 200);
 * 	AGallery a3 = new Texts("welcome.txt", 5.312, 830);
 */
	public AGallery(String nameForSourceFile, double sizes) {
		this.nameForSourceFile = nameForSourceFile;
		this.sizes = sizes;
	}
}


