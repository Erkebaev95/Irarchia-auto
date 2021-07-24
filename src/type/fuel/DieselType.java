package type.fuel;

import type.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
