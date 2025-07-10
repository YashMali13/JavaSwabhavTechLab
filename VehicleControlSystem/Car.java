package VehicleControlSystem;
class Car implements VehicleControl {
    public void start() {
        System.out.println(" Car started.");
    }

    public void stop() {
        System.out.println(" Car stopped.");
    }

    public void changeGear(int gear) {
        try {
            if (gear < 1 || gear > 6)
                throw new InvalidGearException("Car gear must be between 1 and 6.");
            System.out.println(" Car changed to gear " + gear);
        } catch (InvalidGearException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}