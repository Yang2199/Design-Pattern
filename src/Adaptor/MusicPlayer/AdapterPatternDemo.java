package Adaptor.MusicPlayer;

public class AdapterPatternDemo {
	   public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();
	 
	      audioPlayer.play("mp3", "少年.mp3");
	      audioPlayer.play("mp4", "far away from home.mp4");
	      audioPlayer.play("vlc", "虞兮叹.vlc");
	      audioPlayer.play("avi", "动画片.avi");
	   }
	}