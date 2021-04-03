package Adaptor.MusicPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		System.out.println("Play vlc file.Name:"+ fileName);
	}
	@Override
	public void playMp4(String fileName) {
		//nothing to do
	}
}
