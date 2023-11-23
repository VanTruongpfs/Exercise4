package Exercise45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AGalleryTest {
/**
 * this is testing for constructor
 */
	@Test
	public void testConstructor() {
// this is a constructor of class Images
		new Images("flower.gif", 57.234, 100, 50, "medium");
// this is a constructor of class Texts
		new Texts("welcome.txt", 5.312, 830);
// this is a constructor of class Sounds
		new Sounds("theme.mp3", 40960, 200);
	}
/**
 * this is testing for method timeToDouble()
 * 
 */
	@Test
	public void testTimeToDownload() {
		AGallery i1 = new Images("flower.gif", 57.234, 100, 50, "medium");
		AGallery i2 = new Texts("welcome.txt", 5.312, 830);
		AGallery i3 = new Sounds("theme.mp3", 40960, 200);
			assertEquals(i1.timeToDownload(1000),0.057234);
			assertEquals(i2.timeToDownload(1000),0.005312);
			assertEquals(i3.timeToDownload(1000),40.960);
	}
/**
 * this is testing for method smallerThan()
 */
	@Test
	public void testSmallerThan() {
		AGallery i1 = new Images("flower.gif", 57.234, 100, 50, "medium");
		AGallery i2 = new Texts("welcome.txt", 5.312, 830);
		AGallery i3 = new Sounds("theme.mp3", 40960, 200);
			assertTrue(i1.smallerThan(30000));
		 	assertTrue(i2.smallerThan(30000));
		 	assertFalse(i3.smallerThan(30000));
	}
/**
 * this is testing for method sameName()
 */
	@Test
	public void testSameName() {
		AGallery i1 = new Images("flower.gif", 57.234, 100, 50, "medium");
		AGallery i2 = new Texts("welcome.txt", 5.312, 830);
		AGallery i3 = new Sounds("theme.mp3", 40960, 200);
			assertTrue(i1.sameName(i1));
			assertFalse(i2.sameName(i3));
			assertFalse(i3.sameName(i1));
	}
	
}
