package com.javaex.oop.tv;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV( 7, 20, false); 
		tv.status(); // ch 7, vol 20, off
		tv.power( true ); // power on
		tv.volume( 120 ); // vol -1
		tv.status(); // ch 7, vol 19, on
		tv.volume( false ); 
		tv.status();
		tv.channel( 0 );
		tv.status();
		tv.channel( true );
		tv.channel( true );
		tv.channel( true );
		tv.status();
		tv.power( false );
		tv.status();

	}

}
