package Reproductor;

public class mediaPlayer {

    private int volume;
    private String playbackState;

    public mediaPlayer(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }

        playbackState = "stopped";
    }

    public int getVolume() {
        return volume;
    }

    public String getPlaybackState() {
        return playbackState;
    }

    public boolean increaseVolume() {
        if (volume < 100) {
            volume = volume + 5;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseVolume() {
        if (volume > 0) {
            volume = volume - 5;
            return true;
        } else {
            return false;
        }
    }

    public boolean play() {
        if (playbackState.equals("stopped")) {
            playbackState = "playing";
            return true;
        } else {
            return false;
        }
    }

    public boolean stop() {
        if (playbackState.equals("playing")) {
            playbackState = "stopped";
            return true;
        } else {
            return false;
        }
    }
}