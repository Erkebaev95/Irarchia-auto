package type.body;

import type.VehicleTypeEnum;

public class PickupType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
