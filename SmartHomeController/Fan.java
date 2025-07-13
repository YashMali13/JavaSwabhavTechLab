package SmartHomeController;
import java.util.Arrays;
import java.util.List;

public class Fan implements Controllable {
    private final List<String> validModes = Arrays.asList("Low", "Medium", "High");

    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }

    public void setMode(String mode) {
        if (!validModes.contains(mode)) {
            throw new IllegalArgumentException("Invalid Fan mode! Valid modes: " + validModes);
        }
        System.out.println("Fan speed set to: " + mode);
    }
}
