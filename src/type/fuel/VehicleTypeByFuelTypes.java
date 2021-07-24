package type.fuel;

import type.VehicleType;

public abstract class VehicleTypeByFuelTypes extends VehicleType {

    public VehicleTypeByFuelTypes() {
        super("Vehicle type by fuel type");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) obj;
        return attribute != null && attribute.equals(that.attribute);
    }
}