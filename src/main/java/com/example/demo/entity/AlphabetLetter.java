package com.example.demo.entity;


public class AlphabetLetter {
    private String uppercase;
    private String lowercase;
    private String pronunciation;

    public AlphabetLetter(String uppercase, String lowercase, String pronunciation) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.pronunciation = pronunciation;
    }

    public String getUppercase() { return uppercase; }
    public String getLowercase() { return lowercase; }
    public String getPronunciation() { return pronunciation; }
}
