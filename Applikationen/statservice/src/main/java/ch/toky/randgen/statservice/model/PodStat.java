package ch.toky.randgen.statservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PodStat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long podStatID;
    private String id;
    private Long timestamp;
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }
}
