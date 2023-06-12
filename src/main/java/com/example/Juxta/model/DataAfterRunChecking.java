package com.example.Juxta.model;


public class DataAfterRunChecking {
    private Status status;
    private String stdout;
    private int ram;
    private int cpu;
    public DataAfterRunChecking() {}

    public DataAfterRunChecking(Status status, String stdout, int ram, int cpu) {
        this.status = status;
        this.stdout = stdout;
        this.ram = ram;
        this.cpu = cpu;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
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
        return "DataAfterRunChecking{" +
                "status='" + status + '\'' +
                ", stdout='" + stdout + '\'' +
                ", ram=" + ram +
                ", cpu=" + cpu +
                '}';
    }
}
