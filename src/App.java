import java.util.Random;

import game.audio.Soundtrack;

public class App {
    public static void main(String[] args) throws Exception {
        Soundtrack.play("music/portal_radio.wav", true);

        Random random = new Random();

        while (true) {
            if (random.nextInt(5) == 0) {
                Soundtrack.play("sfx/womp.wav");
            }

            Thread.sleep(3000);
        }
    }
}
