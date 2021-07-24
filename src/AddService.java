import type.body.VehicleTypeByBodyTypes;
import type.fuel.VehicleTypeByFuelTypes;
import type.purpose.VehicleTypeByPurpose;

public class AddService {

    private VehicleAd[] adList;

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Обьявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - " +
                        vehicleType.getTypeName() + ", атрибут фильтра " +vehicleType.getAttributeOfType());
            } else {
                System.out.println("Обьявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий - " + vehicleType.getAttributeOfType() + ", так как имеет тип авто " + ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)) {
                System.out.println("Обьявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - " +
                        vehicleType.getTypeName() + ", атрибут фильтра " +vehicleType.getAttributeOfType());
            } else {
                System.out.println("Обьявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий - " + vehicleType.getAttributeOfType() + ", так как имеет тип авто " + ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByFuelTypes().equals(vehicleType)) {
                System.out.println("Обьявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - " +
                        vehicleType.getTypeName() + ", атрибут фильтра " +vehicleType.getAttributeOfType());
            } else {
                System.out.println("Обьявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий - " + vehicleType.getAttributeOfType() + ", так как имеет тип авто " + ad.getVehicleTypeByFuelTypes().getTypeName());
            }
        }
    }

    public void setAds(VehicleAd[] ads) {
        this.adList = ads;
    }
}
