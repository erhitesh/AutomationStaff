package com.gspann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertTemperature {
	
	public static void temperatureConverter(String choice, int temp) {
		switch (choice) {
		case "1":
			System.out.println(1.8*temp+32);
			break;
		case "2":
			System.out.println(((temp-32)*5/9));
			break;
		default:
			System.out.print("Invalid Input ");
            break;
		}
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		int temp;
		String choice = "";
		System.out.println(5/9);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" 1. Celsius to Fahrenheit");
		System.out.println(" 2. Fahrenheit to Celsius");
		System.out.println(" UR CHOICE IS..");
		choice = br.readLine();
		System.out.println("Enter temperature");
		temp = Integer.parseInt(br.readLine());
		temperatureConverter(choice, temp);
	}

}
