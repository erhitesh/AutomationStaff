package com.RGB;

import java.awt.Color;

public class RGBTOHEXA {
	
	
	public static String convertStringToHex(String str) {
		char chars[] = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			buffer.append(Integer.toHexString(chars[i]));
		}
		return buffer.toString();
		
	}
	
	public static String convertHexToString(String hex) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < hex.length(); i+=2) {
		
			String out = hex.substring(i, (i+2));
			int decimal = Integer.parseInt(out, 16);
			buffer.append((char)decimal);
		}
		return buffer.toString();
		
	}
	
	public static String convertRGBToHex(int r, int g, int b) {
		String hexa = "";
		Color color = new Color(r, g, b);
		hexa = Integer.toHexString(color.getRGB());
		System.out.println("RGB to Hexa.."+hexa);
		return hexa;
	}
	public static void main(String args[]) {
		//convertRGBToHexa(0, 0, 255);
		String str = "My Name Is Hitesh";
		String hex = convertStringToHex(str);
		System.out.println("Convert String To Hex..."+hex);
		
		String hex1 = "4d79204e616d6520497320486974657368";
		String string = convertHexToString(hex1);
		System.out.println("Convert Hex To String..."+string);
	}

}
