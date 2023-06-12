package com.example.Juxta.model;

public class DataBeforeChecking {
    private String code;
    private String stdin;

    public DataBeforeChecking() {}

    public DataBeforeChecking(String code, String stdout) {
        this.code = code;
        this.stdin = stdout;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStdin() {
        return stdin;
    }

    public void setStdin(String stdin) {
        this.stdin = stdin;
    }

    @Override
    public String toString() {
        return "DataBeforeChecking{" +
                "code='" + code + '\'' +
                ", stdin='" + stdin + '\'' +
                '}';
    }
}
