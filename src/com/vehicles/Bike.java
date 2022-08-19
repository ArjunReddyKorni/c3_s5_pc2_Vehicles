package com.vehicles;

public class Bike extends VehiclesManuafacturer implements Vehicle{

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vechicleType) {
        if(getVehicleType().equalsIgnoreCase("SportsBike")){
            return 250;
        } else if (getVehicleType().equalsIgnoreCase("cruiser")) {
            return 170;
        }
        return 0;
    }

    @Override
    public String getManufactureInformation() {

        return "Bike{Manufacturer name: '" +getVehicleName() + "', " + "Model Name: '" + getVehicleModelName() +
                "' ,Type: '" + getVehicleType() + "'}.";
    }
}
