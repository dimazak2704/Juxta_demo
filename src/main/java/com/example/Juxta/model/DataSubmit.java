package com.example.Juxta.model;

public class DataSubmit {
    private int ram;
    private int cpu;
    private Status status;
    public DataSubmit () {}

    public DataSubmit(int ram, int cpu, Status status) {
        this.ram = ram;
        this.cpu = cpu;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DataSubmit{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", status=" + status +
                '}';
    }
}
