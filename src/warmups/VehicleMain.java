package warmups;
//DO NOT COMPILE OR MODIFY. LOOK AT WHAT IS RED THIS DEMONSTRATES POLYMORPHISM
public class VehicleMain {

    public static void main(String[] args) {
        Vehicle myVic1 = new Vehicle();
        Vehicle myLandVic1 = new LandVehicle();
        Vehicle myWheeledVic1 = new WheeledVehicle();
        Vehicle myOffroadVehicle1 = new OffroadVehicle();

        myVic1.vehicleVehicle();
        myLandVic1.vehicleVehicle();
        //general things dont get the VIP perks of being specific
        myLandVic1.landVehicle();
        Vehicle[] myGarage1 = {myVic1, myLandVic1, myWheeledVic1, myOffroadVehicle1};

        Vehicle myVic2 = new Vehicle();
        LandVehicle myLandVic2 = new LandVehicle();
        WheeledVehicle myWheeledVic2 = new WheeledVehicle();
        OffroadVehicle myOffroadVehicle2 = new OffroadVehicle();
        Vehicle[] myGarage2 = {myVic2, myLandVic2, myWheeledVic2, myOffroadVehicle2};
        WheeledVehicle[] myWheeledGarage = {myVic2, myLandVic2, myWheeledVic2, myOffroadVehicle2};
    }
}
