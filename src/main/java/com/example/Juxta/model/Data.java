package com.example.Juxta.model;

public class Data {
    private String input;
    private String code;

    public Data() {}

    public Data(String input, String code) {
        this.input = input;
        this.code = code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Data{" +
                "input='" + input + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
