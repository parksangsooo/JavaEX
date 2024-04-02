package com.javaex.oop.tv;

public class TV {
	
	private boolean power;
	private int volume;
	private int channel;
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public TV (int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel >= 1 && channel <= 255) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up == true && channel < 255) {
			channel += 1;
		} else if (up == false && channel > 1) {
			channel -= 1;
		}
	}
	
	public void volume(int volume) {
		if(volume >= 0 && volume <= 100) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if(up && volume < 100) {
			volume++;
		} else if (!up && volume > 0){
			volume--;
		}
	}
	
	public void status() {
		System.out.println("Channel:" + channel + " Volume:" + volume + " Power:" + (power ? "On" : "Off"));
	}

}
