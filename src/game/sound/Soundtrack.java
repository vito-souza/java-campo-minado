package game.sound;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Soundtrack {
    private static final Logger LOGGER = Logger.getLogger(Soundtrack.class.getName());
    private static final String SOUNDTRACK_PATH = "./src/resources/sound/";

    public static void playSound(String sound) {
        File file = new File(SOUNDTRACK_PATH + sound);

        if (!file.exists()) {
            LOGGER.log(Level.WARNING, "Arquivo não encontrado: {0}", file.getPath());
            return;
        }

        try (AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.drain();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao reproduzir o som: {0}", e.getMessage());
        }
    }
}
