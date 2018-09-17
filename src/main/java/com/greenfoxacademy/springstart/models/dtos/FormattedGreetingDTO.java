package com.greenfoxacademy.springstart.models.dtos;

public class FormattedGreetingDTO {
    private String message;
    private int redValue;
    private int greenValue;
    private int blueValue;
    private int fontSizePercent;

    public FormattedGreetingDTO() {
    }

    public FormattedGreetingDTO(String message, int redValue, int greenValue, int blueValue, int fontSizePercent) {
        this.message = message;
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
        this.fontSizePercent = fontSizePercent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRedValue() {
        return redValue;
    }

    public void setRedValue(int redValue) {
        this.redValue = redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public void setBlueValue(int blueValue) {
        this.blueValue = blueValue;
    }

    public int getFontSizePercent() {
        return fontSizePercent;
    }

    public void setFontSizePercent(int fontSizePercent) {
        this.fontSizePercent = fontSizePercent;
    }
}
