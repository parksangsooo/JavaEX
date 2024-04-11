package com.javaex.api.objectclass.justice;

import java.util.Arrays;

public class toString extends Object{
	final int num;
	
	public toString(int num) {
		this.num = num * 100;
	}
	
	@Override
	public String toString() {
		return Integer.toString(num);
		}
}
