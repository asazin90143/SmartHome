package SmartHome;

public class LightAdapter implements HomeController{
    private Lights lights;

    public LightAdapter(Lights lights){
        this.lights = lights;

    }

    @Override
    public String powerOn() {
        return lights.turnOn();
    }

    @Override
    public String powerOff() {
        return lights.turnOff();
    }

    @Override
    public String pressUpButton() {
        return lights.brightnessUp();
    }

    @Override
    public String pressDownButton() {
        return lights.brightnessDown();
    }
    
}
