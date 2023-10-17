package SmartHome;

public class ThermostatAdapter implements HomeController {
    private Thermostat thermostat;

    public ThermostatAdapter(Thermostat thermostat){
        this.thermostat = thermostat;

    }


    @Override
    public String powerOn() {
         return thermostat.switchOn();
    }

    @Override
    public String powerOff() {
        return thermostat.switchOff();
    }

    @Override
    public String pressUpButton() {
        return thermostat.tempUp();
    }

    @Override
    public String pressDownButton() {
        return thermostat.tempDown();
    }
    
}
