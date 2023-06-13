package com.example.Juxta.model;


public class DataRun {
    private String output;
    private int ram;
    private int cpu;
    private int exitCode;
    private Status status;

    public DataRun () {}

    public DataRun(String output, int ram, int cpu, int exitCode, Status status) {
        this.output = output;
        this.ram = ram;
        this.cpu = cpu;
        this.exitCode = exitCode;
        this.status = status;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
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

    @Override
    public String toString() {
        return "DataRun{" +
                "output='" + output + '\'' +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", exitCode=" + exitCode +
                ", status=" + status +
                '}';
    }
}
