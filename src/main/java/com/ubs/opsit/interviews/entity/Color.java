package com.ubs.opsit.interviews.entity;

public enum Color {

    RED("R"), YELLOW("Y");

    private String colorCode;

    private Color(String colorCode) {
	this.colorCode = colorCode;
    }

    public String getColorCode() {
	return colorCode;
    }

    public String toString() {
	return colorCode;
    }

}
