package com.javaex.api.objectclass.justice;

import java.util.Arrays;

public class toStringTest {
	public static void main(String[] args) {
    	Object[] arr = new Object[5];
    	arr[0] = new toString(1);
        arr[1] = new toString(2);
        arr[2] = new toString(3);
        arr[3] = new toString(4);
        arr[4] = new toString(5);

        System.out.println(Arrays.toString(arr));
        // [com.javaex.api.objectclass.justice.toString@37a71e93, com.javaex.api.objectclass.justice.toString@7e6cbb7a, com.javaex.api.objectclass.justice.toString@7c3df479, com.javaex.api.objectclass.justice.toString@7106e68e, com.javaex.api.objectclass.justice.toString@7eda2dbb]


        }
	}
