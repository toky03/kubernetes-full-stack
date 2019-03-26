package ch.toky.randgen.middletier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PodStat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long podStatID;
    private String id;
    private Long timeStamp;
    private Long counter;

    public Long getPodStatID() {
        return podStatID;
    }

    public void setPodStatID(Long podStatID) {
        this.podStatID = podStatID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }
}
