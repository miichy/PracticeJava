package AdapterPattern;

import org.omg.CORBA.IntHolder;

import java.util.Arrays;

public class AdapterPatternDemo {
	
	{
		int a = 0;
	}

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "alone.vlc");
		audioPlayer.play("avi", "mind me.avi");
		
		int[] ai1 = {1,2};
		int[] ai2 = Arrays.copyOf(ai1, ai1.length * 2);
		System.out.println(ai2.length);

	}

}
