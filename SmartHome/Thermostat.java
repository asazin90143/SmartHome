package SmartHome;

public class Thermostat {
    public String switchOn(){
        return "Thermostat is switching on. Starting cooling sequence !";
    }

    public String switchOff(){
        return "Thermostat is switched to standby mode!";
    }

    public String tempUp(){
        return "The room temperature is increasing!";
    }

    public String tempDown(){
        return "The room temperature is decreasing!";
    }
}