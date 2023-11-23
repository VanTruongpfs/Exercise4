package Exercise45;

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
/**
 * this is a method timeToDownload ()
 * @param sizesPerTime
 * @return
 * example:
 *  AGallery a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
 * 	AGallery a2 = new Texts("welcome.txt", 5.312, 830);
 * 	AGallery a3 = new Sounds("theme.mp3", 40960, 200);
 * 		assertEquals(a1.timeToDownload(1000),0.057234);
 * 		assertEquals(a2.timeToDownload(1000),0.005312);
 * 		assertEquals(a3.timeToDownload(1000),40.960);
 * 	
 */
	public double timeToDownload(int sizesPerTime) {
		return this.sizes / sizesPerTime;
 }
/**
 * this is a method smallerThan()
 * @param maxSizes
 * @return
 * example:
 * 	AGallery a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
 * 	AGallery a2 = new Texts("welcome.txt", 5.312, 830);
 * 	AGallery a3 = new Sounds("theme.mp3", 40960, 200);
 * 		assertTrue(a1.smallerThan(30000));
 * 		assertTrue(a2.smallerThan(30000));
 * 		assertFalse(a3.smallerThan(30000));
 * 	
 */
	public boolean smallerThan(double maxSizes) {
		if(this.sizes < maxSizes) {
			return true;
		}else {
			return false;
		}
	}
/**
 * this is a method sameName()
 * @param nameForSourceFile
 * @return
 * example:
 * 	AGallery a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
 * 	AGallery a2 = new Texts("welcome.txt", 5.312, 830);
 * 	AGallery a3 = new Sounds("theme.mp3", 40960, 200);
 * 		assertTrue(a1.sameName(a1));
 * 		assertTrue(a2.sameName(a3);
 * 		assertFalse(a3.sameName(a1));
 * 
 */
	public boolean sameName(AGallery Other ) {
		if(this.nameForSourceFile.equals(Other.nameForSourceFile)) {
			return true;
		}else {
			return false;
		}
	}
//@Override
//	public boolean equals(Object obj) {
//		if(obj == null || !(obj instanceof AGallery)) {
//			return false;
//		}else {
//			AGallery other = (AGallery) obj;
//			return this.nameForSourceFile.equals(other.nameForSourceFile) &&
//					this.sizes == other.sizes;
//		}
}

