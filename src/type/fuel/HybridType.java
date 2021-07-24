package type.fuel;

import type.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}