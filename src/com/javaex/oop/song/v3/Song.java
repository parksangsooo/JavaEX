package com.javaex.oop.song.v3;

// v3. This 
// 기본 생성자와 전체 필드 생성자

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song (String title, String artist) {
		this.artist = artist;
		this.title = title;
		System.out.println("title, artist 초기화");
	}
	
	public Song (String title,
				String artist,
				String album,
				String composer,
				int year,
				int track) {
		
		this(title, artist);
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		System.out.println("전체 필드 생성자");
	}	
		
	public String getTitle() {
		return title;
	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
	public String getArtist() {
		return artist;
	}
	
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
	
	public String getAlbum() {
		return album;
	}
	
//	public void setAlbum(String album) {
//		this.album = album;
//	}
//	
	public String getComposer() {
		return composer;
	}
	
//	public void setComposer(String composer) {
//		this.composer = composer;
//	}
	
	public int getYear() {
		return year;
	}
//	public void setYear(int year) {
//		this.year = year;
//	}
	
	public int getTrack() {
		return track;
	}
	
//	public void setTrack(int track) {
//		this.track = track;
//	}
	
	public void showinfo() {
		System.out.printf("%s, %s, (%s, %d, %d번 track, %s 작곡)\n", artist ,title, album, year, track, composer);
	}
	
}
