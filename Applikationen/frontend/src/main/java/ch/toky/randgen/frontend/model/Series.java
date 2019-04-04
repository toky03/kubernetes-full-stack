package ch.toky.randgen.frontend.model;

import java.util.List;

public class Series {

    private String name;
    private List<SeriesItem> series;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SeriesItem> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesItem> series) {
        this.series = series;
    }
}
