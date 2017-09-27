package net.chinanets.sj.bean;

import java.util.Date;

public class Cpws {
    private Integer id;

    private Integer ndh;

    private String ajlb;

    private String ajbh;

    private String mc;

    private Integer wslx;

    private Integer sj;

    private String slfy;

    private String slfg;

    private String dllsuo;

    private String dllshi;

    private Date wszzrq;

    private Integer ayId;

    private String dsr;

    private Integer sfsm;

    private String nrzy;

    private Integer gdfyId;

    private String nr;

    public Cpws() {
    }

    public Cpws(Integer id, Integer ndh, String ajlb, String ajbh, String mc, Integer wslx, Integer sj, String slfy, String slfg, String dllsuo, String dllshi, Date wszzrq, Integer ayId, String dsr, Integer sfsm, String nrzy, Integer gdfyId, String nr) {
        this.id = id;
        this.ndh = ndh;
        this.ajlb = ajlb;
        this.ajbh = ajbh;
        this.mc = mc;
        this.wslx = wslx;
        this.sj = sj;
        this.slfy = slfy;
        this.slfg = slfg;
        this.dllsuo = dllsuo;
        this.dllshi = dllshi;
        this.wszzrq = wszzrq;
        this.ayId = ayId;
        this.dsr = dsr;
        this.sfsm = sfsm;
        this.nrzy = nrzy;
        this.gdfyId = gdfyId;
        this.nr = nr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNdh() {
        return ndh;
    }

    public void setNdh(Integer ndh) {
        this.ndh = ndh;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public Integer getWslx() {
        return wslx;
    }

    public void setWslx(Integer wslx) {
        this.wslx = wslx;
    }

    public Integer getSj() {
        return sj;
    }

    public void setSj(Integer sj) {
        this.sj = sj;
    }

    public String getSlfy() {
        return slfy;
    }

    public void setSlfy(String slfy) {
        this.slfy = slfy;
    }

    public String getSlfg() {
        return slfg;
    }

    public void setSlfg(String slfg) {
        this.slfg = slfg;
    }

    public String getDllsuo() {
        return dllsuo;
    }

    public void setDllsuo(String dllsuo) {
        this.dllsuo = dllsuo;
    }

    public String getDllshi() {
        return dllshi;
    }

    public void setDllshi(String dllshi) {
        this.dllshi = dllshi;
    }

    public Date getWszzrq() {
        return wszzrq;
    }

    public void setWszzrq(Date wszzrq) {
        this.wszzrq = wszzrq;
    }

    public Integer getAyId() {
        return ayId;
    }

    public void setAyId(Integer ayId) {
        this.ayId = ayId;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public Integer getSfsm() {
        return sfsm;
    }

    public void setSfsm(Integer sfsm) {
        this.sfsm = sfsm;
    }

    public String getNrzy() {
        return nrzy;
    }

    public void setNrzy(String nrzy) {
        this.nrzy = nrzy;
    }

    public Integer getGdfyId() {
        return gdfyId;
    }

    public void setGdfyId(Integer gdfyId) {
        this.gdfyId = gdfyId;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Cpws{" +
                "id=" + id +
                ", ndh=" + ndh +
                ", ajlb='" + ajlb + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", mc='" + mc + '\'' +
                ", wslx=" + wslx +
                ", sj=" + sj +
                ", slfy='" + slfy + '\'' +
                ", slfg='" + slfg + '\'' +
                ", dllsuo='" + dllsuo + '\'' +
                ", dllshi='" + dllshi + '\'' +
                ", wszzrq=" + wszzrq +
                ", ayId=" + ayId +
                ", dsr='" + dsr + '\'' +
                ", sfsm=" + sfsm +
                ", nrzy='" + nrzy + '\'' +
                ", gdfyId=" + gdfyId +
                ", nr='" + nr + '\'' +
                '}';
    }
}