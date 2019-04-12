package ch.toky.randgen.statservice.model;

import java.util.ArrayList;
import java.util.List;

public class Series {

    private String name;
    private List<SeriesItem> series;

    public Series(String name){
        this.name = name;
        this.series = new ArrayList<SeriesItem>();
    }

    public void appendSeriesItem(SeriesItem seriesItem){
        this.series.add(seriesItem);
    }

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
