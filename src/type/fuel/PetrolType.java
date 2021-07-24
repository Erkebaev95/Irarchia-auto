package type.fuel;

import type.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}