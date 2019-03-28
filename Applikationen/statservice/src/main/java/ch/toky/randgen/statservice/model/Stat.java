package ch.toky.randgen.statservice.model;

public class Stat {

    private String id;
    private Long counter;

    public Stat(String id, Long counter) {
        this.id = id;
        this.counter = counter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }
}
