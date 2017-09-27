package net.chinanets.sj.bean;

public class Ay {
    private Integer id;

    private Integer ajlxId;

    private Integer klb;

    private Integer sjayid;

    private String mc;

    private Integer ayjb;

    private String qlj;

    private String ayfl;

    private Integer status;

    public Ay() {
    }

    public Ay(Integer id, Integer ajlxId, Integer klb, Integer sjayid, String mc, Integer ayjb, String qlj, String ayfl, Integer status) {
        this.id = id;
        this.ajlxId = ajlxId;
        this.klb = klb;
        this.sjayid = sjayid;
        this.mc = mc;
        this.ayjb = ayjb;
        this.qlj = qlj;
        this.ayfl = ayfl;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAjlxId() {
        return ajlxId;
    }

    public void setAjlxId(Integer ajlxId) {
        this.ajlxId = ajlxId;
    }

    public Integer getKlb() {
        return klb;
    }

    public void setKlb(Integer klb) {
        this.klb = klb;
    }

    public Integer getSjayid() {
        return sjayid;
    }

    public void setSjayid(Integer sjayid) {
        this.sjayid = sjayid;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public Integer getAyjb() {
        return ayjb;
    }

    public void setAyjb(Integer ayjb) {
        this.ayjb = ayjb;
    }

    public String getQlj() {
        return qlj;
    }

    public void setQlj(String qlj) {
        this.qlj = qlj;
    }

    public String getAyfl() {
        return ayfl;
    }

    public void setAyfl(String ayfl) {
        this.ayfl = ayfl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ay{" +
                "id=" + id +
                ", ajlxId=" + ajlxId +
                ", klb=" + klb +
                ", sjayid=" + sjayid +
                ", mc='" + mc + '\'' +
                ", ayjb=" + ayjb +
                ", qlj='" + qlj + '\'' +
                ", ayfl='" + ayfl + '\'' +
                ", status=" + status +
                '}';
    }
}