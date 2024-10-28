package WithoutStrategyPattern;

public class OffLoadVehicle extends Vehicle{
    @Override
    public void drive(){
        //It has its special method & different drive logic
        System.out.println("Normal Drive Capability");
    }
}
