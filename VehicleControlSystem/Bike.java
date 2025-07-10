package VehicleControlSystem;
class Bike implements VehicleControl {
    public void start() {
        System.out.println(" Bike started.");
    }

    public void stop() {
        System.out.println(" Bike stopped.");
    }

    public void changeGear(int gear) {
        try {
            if (gear < 1 || gear > 5)
                throw new InvalidGearException("Bike gear must be between 1 and 5.");
            System.out.println(" Bike changed to gear " + gear);
        } catch (InvalidGearException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}