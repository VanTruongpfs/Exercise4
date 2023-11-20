package Exercise42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ARecordsTest {
/**
 * this is testing for constructor
 */
	@Test
	public void testConstructor() {
		ARecords i1 = new Images("flower.gif", 57.234, 100, 50, "medium");
		ARecords s1 = new Sounds("theme.mp3", 40.960, 200);
		ARecords t1 = new Texts("welcome.txt", 5.312, 830);

}
}