package type.fuel;

import type.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}