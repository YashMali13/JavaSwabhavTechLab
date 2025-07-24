package SmartHomeController;

import java.util.Arrays;
import java.util.List;

public class Speaker implements Controllable {
    private final List<String> validModes = Arrays.asList("Bass", "Treble", "Balanced");

    public void turnOn() {
        System.out.println("Speaker is turned ON");
    }

    public void turnOff() {
        System.out.println("Speaker is turned OFF");
    }

    public void setMode(String mode) {
        if (!validModes.contains(mode)) {
            throw new IllegalArgumentException("Invalid Speaker mode! Valid modes: " + validModes);
        }
        System.out.println("Speaker mode set to: " + mode);
    }
}
