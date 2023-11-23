package Exercise45;


public class Images extends AGallery {
	private int width;
	private int height;
	private String quality;
/**
 * this is a constructor of class Images. There are 5 field
 * @param nameForSourceFile
 * @param sizes
 * @param width
 * @param height
 * @param quality
 * example:
 * 	new Images("flower.gif", 57.234, 100, 50, "medium");
 */
	public Images(String nameForSourceFile, double sizes, int width, int height, String quality) {
		super(nameForSourceFile, sizes);
		this.width = width;
		this.height = height;
		this.quality = quality;
}

}