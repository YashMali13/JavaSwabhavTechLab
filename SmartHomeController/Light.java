package SmartHomeController;

import java.util.Arrays;
import java.util.List;

public class Light implements Controllable {
    

    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
    private final List<String> validModes = Arrays.asList("Bright", "Dim", "Night");
    public void setMode(String mode) {
        if (!validModes.contains(mode)) {
            throw new IllegalArgumentException("Invalid Light mode! Valid modes: " + validModes);
        }
        System.out.println("Light mode set to: " + mode);
    }
}

