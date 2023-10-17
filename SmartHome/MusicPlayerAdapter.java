package SmartHome;

public class MusicPlayerAdapter implements HomeController {
    private MusicPlayer musicPlayer;

    public MusicPlayerAdapter(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;

    }


    @Override
    public String powerOn() {
        return musicPlayer.musicOn();
    }

    @Override
    public String powerOff() {
        return musicPlayer.musicOff();
    }

    @Override
    public String pressUpButton() {
        return musicPlayer.volumeUp();
    }

    @Override
    public String pressDownButton() {
    
        return musicPlayer.voulumeDown();
    }

    
}
