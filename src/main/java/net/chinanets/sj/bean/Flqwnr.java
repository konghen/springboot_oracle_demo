package net.chinanets.sj.bean;

public class Flqwnr {
    private Integer id;

    private String nr;

    public Flqwnr() {
    }

    public Flqwnr(Integer id, String nr) {
        this.id = id;
        this.nr = nr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Flqwnr{" +
                "id=" + id +
                ", nr='" + nr + '\'' +
                '}';
    }
}