public class Main {
    public static void main(String[] args) {
        AddService addService = new AddService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new PetrolType(), new CarType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new DieselType(), new PickupType());
        VehicleAd teslaAd = new VehicleAd("Tesla", "77", new SedanType(), new ElectricType(), new CarType());
        VehicleAd busAd = new VehicleAd("AstraBus", "11", new BusType(), new DieselType(), new PickupType());
        addService.setAdList(new VehicleAd[] {volvoAd, kamazAd, teslaAd});
        // for purpose
        addService.filterByVehicleTypeByPurpose(new TruckType());
        addService.filterByVehicleTypeByPurpose(new PassengerType());
        addService.filterByVehicleTypeByPurpose(new SedanType());
        // for fuel
        addService.filterByVehicleTypeByFuelTypes(new PetrolType());
        addService.filterByVehicleTypeByFuelTypes(new ElectricType());
        // for body
        addService.filterByVehicleTypeByBodyTypes(new CarType());
        addService.filterByVehicleTypeByBodyTypes(new PickupType());
    }
}
