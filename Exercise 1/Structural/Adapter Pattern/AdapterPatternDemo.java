public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer player = new Mp3Player();
        player.play("mp3", "song.mp3");
    }
}
