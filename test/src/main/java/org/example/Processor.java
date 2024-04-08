package org.example;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threats;
    private  String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor() {
        this.brand = "Intel";
        this.series = "11000u";
        this.generation = 11;
        this.cores = 4;
        this.threats = 4 ;
        this.cacheMemory = "5MB";
        this.frequency = "2.3GHZ";
        this.minFrequency = "2.4GHZ" ;
        this.maxFrequency = "3.1GHZ";
    }

    public Processor(String brand, String series, int generation, int cores, int threats, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threats = threats;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreats() {
        return threats;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threats=" + threats +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                '}';
    }
}
