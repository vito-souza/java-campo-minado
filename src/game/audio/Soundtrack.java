package game.audio;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Soundtrack {
    private static final Logger LOGGER = Logger.getLogger(Soundtrack.class.getName());
    private static final String SOUNDTRACK_PATH = "src/assets/music/";

    private Soundtrack() {
    }

    public static void play(String sound) {
        play(sound, false);
    }

    public static void play(String sound, boolean loop) {
        new Thread(() -> {
            File file = getFile(sound);

            if (file == null) {
                return;
            }

            try (AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
                Clip clip = AudioSystem.getClip();
                clip.open(audio);

                if (loop) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } else {
                    clip.start();
                }

                clip.drain();
                clip.close();
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Erro ao reproduzir o som: {0}", e.getMessage());
            }
        }).start();
    }

    private static File getFile(String path) {
        File file = new File(SOUNDTRACK_PATH + path);

        if (!file.exists()) {
            LOGGER.log(Level.WARNING, "Arquivo não encontrado: {0}", file.getPath());
            return null;
        }

        return file;
    }
}
