package Exercise42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IGalleryTest {
/**
 * this is testing extends of interface IGallery
 */
	@Test
	void testConstructor() {
		IGallery a1 = new Images("flower.gif", 57.234, 100, 50, "medium");
		IGallery a2 = new Sounds("theme.mp3", 40.960, 200);
		IGallery a3 = new Texts("welcome.txt", 5.312, 830);
	}

}
