import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Metodes {
	public static void paradiPokemonPasauli() {
		ImageIcon darbinieksGif = new ImageIcon(".//images//pokemon.gif");
		JOptionPane.showMessageDialog(null, "", "Pokemon pasaule", JOptionPane.INFORMATION_MESSAGE, darbinieksGif);
	}
	//pievieno skanu
	public static  void izvaditPokemonGoSkanu() {
		try {
			File f = new File(".//audio//"+"pokemon-go.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(f.toURI().toURL());
			Clip c = AudioSystem.getClip();
			c.open(ais);
			c.start();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
