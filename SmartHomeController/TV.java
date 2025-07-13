package SmartHomeController;
import java.util.Arrays;
import java.util.List;

public class TV implements Controllable {
    private final List<String> validModes = Arrays.asList("SD", "HD", "4K");

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public void setMode(String mode) {
        if (!validModes.contains(mode)) {
            throw new IllegalArgumentException("Invalid TV mode! Valid modes: " + validModes);
        }
        System.out.println("TV mode set to: " + mode);
    }
}

