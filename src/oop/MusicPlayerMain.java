package oop;

public class MusicPlayerMain {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.On();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.Off();

    }
}

