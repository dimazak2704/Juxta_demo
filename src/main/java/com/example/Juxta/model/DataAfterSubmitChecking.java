package com.example.Juxta.model;


public class DataAfterSubmitChecking {
    private int exitCode;
    private Status status;
    private int ram;
    private int cpu;

    public DataAfterSubmitChecking() {}

    public DataAfterSubmitChecking(int exitCode, Status status, int ram, int cpu) {
        this.exitCode = exitCode;
        this.status = status;
        this.ram = ram;
        this.cpu = cpu;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "DataAfterSubmitChecking{" +
                "exitCode=" + exitCode +
                ", status='" + status + '\'' +
                ", ram=" + ram +
                ", cpu=" + cpu +
                '}';
    }
}
