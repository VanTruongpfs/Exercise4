package Exercise45;

public class Sounds extends AGallery {
	private int playingTime;
/**
 * this is constructor of class Sounds. There are 3 field
 * @param nameForSourceFile
 * @param sizes
 * @param playingTime
 * example:
 * 	new Sounds("theme.mp3", 40.960, 200);
 */
	public Sounds(String nameForSourceFile, double sizes, int playingTime) {
		super(nameForSourceFile, sizes);
		this.playingTime = playingTime;
	}
}
