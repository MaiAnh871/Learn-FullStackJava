package org.studyeasy.laptop.components;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor() {
        this.brand = "intel ";
        this.series = "i5 7200u";
        this.generation = 7;
        this.cores = 2;
        this.threads = 4;
        this.cacheMemory = "3MB";
        this.frequency = "2.5Ghz";
        this.minFrequency = "2.5Ghz";
        this.maxFrequency = "3.16Ghz";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(String cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public void setMinFrequency(String minFrequency) {
        this.minFrequency = minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(String maxFrequency) {
        this.maxFrequency = maxFrequency;
    }
}
