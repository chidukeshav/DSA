package stack;

import java.util.Stack;

public class MusicSystemNav {
	private Stack<String> next_song;
	private Stack<String> previous_song;
	private String current_song;

	public MusicSystemNav() {
		next_song = new Stack<>();
		previous_song = new Stack<>();
		current_song = "Millionare";
	}

	public void playSong(String song) {
		previous_song.push(current_song);
		current_song = song;
		next_song.clear();
	}

	public void previousSong() {
		if (!previous_song.isEmpty()) {
			next_song.push(current_song);
			current_song = previous_song.pop();
			System.out.println("The previous song is " + current_song);

		} else {
			System.out.println("There is no previous song in playlist");
		}

	}

	public void nextSong() {
		if (!next_song.isEmpty()) {
			previous_song.push(current_song);
			current_song = next_song.pop();
			System.out.println("The next song in playlist is " + current_song);
		} else {
			System.out.println("there is no next song in playList");
		}
	}

	public String currentSong() {
		return current_song;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystemNav m = new MusicSystemNav();
		m.playSong("BlueEyes");
		System.out.println(m.currentSong());
		m.previousSong();
		m.nextSong();
	}

}
