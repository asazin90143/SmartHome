package SmartHome;

public class SmartApp {

    private static HomeController ligntHc;

    /**
     * @param args
     */
    public static void main(String[] args){

        Lights lights = new Lights();
        HomeController lightHc = new LightAdapter(lights);

        MusicPlayer musicPlayer = new MusicPlayer();
        HomeController musicPlayerHc = new MusicPlayerAdapter(musicPlayer);

        Thermostat thermostat = new Thermostat();
        HomeController thermostatHc = new ThermostatAdapter(thermostat);

        

        //turn on 
        System.out.println(lightHc.powerOn());
        System.out.println(musicPlayerHc.powerOn());
        System.out.println(thermostatHc.powerOn());

        System.out.println();


        //turn off
        System.out.println(lightHc.powerOff());
        System.out.println(musicPlayerHc.powerOff());
        System.out.println(thermostatHc.powerOff());

        System.out.println();

        //press Up
        System.out.println(ligntHc.pressUpButton());
        System.out.println(musicPlayerHc.pressUpButton());
        System.out.println(thermostatHc.pressUpButton());

        System.out.println();

        //press Down
        
        System.out.println(ligntHc.pressDownButton());
        System.out.println(musicPlayerHc.pressDownButton());
        System.out.println(thermostatHc.pressDownButton());


    }
    
}
