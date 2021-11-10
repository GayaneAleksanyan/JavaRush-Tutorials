package com.threadsBeachCompare;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach firstBeach = new Beach("K", 15, 1);
        Beach secondBeach = new Beach("L", 50, 1);
        System.out.println(firstBeach.compareTo(secondBeach));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int result;
        int compare = 0;

        if (this.getDistance() > o.getDistance() && this.getQuality() < o.getQuality()) {
            compare = -1;
        } else if (this.getDistance() > o.getDistance() && this.getQuality() > o.getQuality()) {
            compare = 0;
        } else if (this.getDistance() > o.getDistance() && this.getQuality() == o.getQuality()) {
            compare = -1;
        }

        if (this.getDistance() < o.getDistance() && this.getQuality() > o.getQuality()) {
            compare = 1;
        } else if (this.getDistance() < o.getDistance() && this.getQuality() < o.getQuality()) {
            compare = 0;
        } else if (this.getDistance() < o.getDistance() && this.getQuality() == o.getQuality()) {
            compare = 1;
        }

        if (this.getDistance() == o.getDistance() && this.getQuality() > o.getQuality()) {
            compare = 1;
        } else if (this.getDistance() == o.getDistance() && this.getQuality() < o.getQuality()) {
            compare = -1;
        } else if (this.getDistance() == o.getDistance() && this.getQuality() == o.getQuality()) {
            compare = 0;
        }

        result = compare;
        return result;
    }
}
