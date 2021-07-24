package type.body;

import type.VehicleTypeEnum;
import type.purpose.VehicleTypeByPurpose;

public class BusType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
