package net.chinanets.sj.bean;

public class Flfl {
    private Integer id;

    private Integer sjflflid;

    private String mc;

    private Integer flfljb;

    private String gflfl;

    private String qlj;

    public Flfl() {
    }

    public Flfl(Integer id, Integer sjflflid, String mc, Integer flfljb, String gflfl, String qlj) {
        this.id = id;
        this.sjflflid = sjflflid;
        this.mc = mc;
        this.flfljb = flfljb;
        this.gflfl = gflfl;
        this.qlj = qlj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSjflflid() {
        return sjflflid;
    }

    public void setSjflflid(Integer sjflflid) {
        this.sjflflid = sjflflid;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public Integer getFlfljb() {
        return flfljb;
    }

    public void setFlfljb(Integer flfljb) {
        this.flfljb = flfljb;
    }

    public String getGflfl() {
        return gflfl;
    }

    public void setGflfl(String gflfl) {
        this.gflfl = gflfl;
    }

    public String getQlj() {
        return qlj;
    }

    public void setQlj(String qlj) {
        this.qlj = qlj;
    }

    @Override
    public String toString() {
        return "Flfl{" +
                "id=" + id +
                ", sjflflid=" + sjflflid +
                ", mc='" + mc + '\'' +
                ", flfljb=" + flfljb +
                ", gflfl='" + gflfl + '\'' +
                ", qlj='" + qlj + '\'' +
                '}';
    }
}