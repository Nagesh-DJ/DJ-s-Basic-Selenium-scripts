package com.practice.selenium;

import java.util.Date;

public class aa_TimeDate {
public static void main(String[] args) {
	String date = new Date().toString();
	String time=date.replace(" ", "_").replace(":","_");
	System.out.println(time);
}
}
