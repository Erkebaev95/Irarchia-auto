import type.body.PickupType;
import type.body.SedanType;
import type.fuel.DieselType;
import type.fuel.PetrolType;
import type.purpose.CarType;
import type.purpose.PassengerType;
import type.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AddService adService = new AddService();
        VehicleAd ad1 = new VehicleAd("Volvo", 45, new PassengerType(), new PetrolType(), new SedanType());
        VehicleAd ad2 = new VehicleAd("Kamaz", 123, new TruckType(), new DieselType(), new PickupType());
        VehicleAd ad3 = new VehicleAd("", 77, new CarType(), new DieselType(), new SedanType());

        adService.setAds(new VehicleAd[]{
                ad1, ad2, ad3
        });

        adService.filterByVehicleTypeByPurpose(new PassengerType());
        adService.filterByVehicleTypeByPurpose(new TruckType());
        adService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
