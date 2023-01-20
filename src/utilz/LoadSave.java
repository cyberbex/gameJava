package utilz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadSave {
	
	public static final String PLAYER_ATLAS =  "res/player_sprites.png";
	
	public static BufferedImage GetSpriteAtlas(String fileName) {
		BufferedImage img = null;
		// InputStream f = getClass().getResourceAsStream("/player_sprites.png");
		File f = new File(fileName);
		try {
			img = ImageIO.read(f);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}
