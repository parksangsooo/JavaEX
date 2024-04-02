package com.javaex.oop.song.v2;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
//		iu.setArtist("아이유");
//		iu.setAlbum("Real");
//		iu.setTitle("좋은날");
//		iu.setComposer("이민수");
//		iu.setYear(2010);
//		iu.setTrack(3);
		
		Song bigBang = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 4);
//		bigBang.setArtist("BIGBANG");
//		bigBang.setAlbum("Always");
//		bigBang.setTitle("거짓말");
//		bigBang.setComposer("G-DRAGON");
//		bigBang.setYear(2007);
//		bigBang.setTrack(4);
		
		Song busKer = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
//		busKer.setArtist("버스커버스커");
//		busKer.setAlbum("버스커버스커1집");
//		busKer.setTitle("벚꽃엔딩");
//		busKer.setComposer("장범준");
//		busKer.setYear(2012);
//		busKer.setTrack(4);
		
		iu.showinfo();
		bigBang.showinfo();
		busKer.showinfo();

	}

}
