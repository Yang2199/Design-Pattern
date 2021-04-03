package Adaptor.MusicPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
	public void playVlc(String fileName) {
		//nothing to do
	}
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+fileName);
	}
}
