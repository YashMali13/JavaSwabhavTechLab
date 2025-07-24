package VehicleControlSystem;

class Truck implements VehicleControl {
    public void start() {
        System.out.println(" Truck started.");
    }

    public void stop() {
        System.out.println(" Truck stopped.");
    }

    public void changeGear(int gear) {
        try {
            if (gear < 1 || gear > 8)
                throw new InvalidGearException("Truck gear must be between 1 and 8.");
            System.out.println(" Truck changed to gear " + gear);
        } catch (InvalidGearException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}
