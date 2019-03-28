package ch.toky.randgen.statservice.model;

public class SeriesItem {

    private Long name;
    private Long value;

    public SeriesItem(Long name, Long value){
        super();
        this.name = name;
        this.value = value;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }


}
