package com.ubs.opsit.interviews.entity;

public class Lamp {

    private Color color;
    private boolean on;

    public Lamp(Color color) {
	this.color = color;
	this.on = false;
    }

    public Color getColor() {
	return color;
    }

    public void setColor(Color color) {
	this.color = color;
    }

    public boolean isOn() {
	return on;
    }

    public void turnOn() {
	this.on = true;
    }

    public void turnOff() {
	this.on = false;
    }

    @Override
    public String toString() {
	if (this.on) {
	    return color.toString();
	} else {
	    return "O";
	}
    }
}
