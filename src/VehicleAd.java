public class VehicleAd {
    private String model;
    private String id;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByFuelTypes vehicleTypeByFuelTypes;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;

    public VehicleAd(String model, String id, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByFuelTypes vehicleTypeByFuelTypes, VehicleTypeByBodyTypes vehicleTypeByBodyTypes) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
    }

    public VehicleAd(String model) {
        this.model = model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
        return vehicleTypeByFuelTypes;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return this.model;
    }
}