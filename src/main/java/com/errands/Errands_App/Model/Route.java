package com.errands.Errands_App.Model;

import java.util.List;

public class Route {
    private List<Location> locations;
    private double totalDistance;

    public Route(List<Location> locations, double totalDistance) {
        this.locations = locations;
        this.totalDistance = totalDistance;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    // May need to override toString, equals, and hash

}
