package priv.lowe.kfmonitor.entity;

import javax.persistence.*;

@Entity
@Table(name="ipstate")
public class Ipstate {
    private int idipstate;
    private String ip;
    private Integer state;
    private String gname;
    private String gzone;
    private String zserver;
    private Integer port;

    @Id
    @Column(name = "idipstate")
    public int getIdipstate() {
        return idipstate;
    }

    public void setIdipstate(int idipstate) {
        this.idipstate = idipstate;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Basic
    @Column(name = "gzone")
    public String getGzone() {
        return gzone;
    }

    public void setGzone(String gzone) {
        this.gzone = gzone;
    }

    @Basic
    @Column(name = "zserver")
    public String getZserver() {
        return zserver;
    }

    public void setZserver(String zserver) {
        this.zserver = zserver;
    }

    @Basic
    @Column(name = "port")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ipstate ipstate = (Ipstate) o;

        if (idipstate != ipstate.idipstate) return false;
        if (ip != null ? !ip.equals(ipstate.ip) : ipstate.ip != null) return false;
        if (state != null ? !state.equals(ipstate.state) : ipstate.state != null) return false;
        if (gname != null ? !gname.equals(ipstate.gname) : ipstate.gname != null) return false;
        if (gzone != null ? !gzone.equals(ipstate.gzone) : ipstate.gzone != null) return false;
        if (zserver != null ? !zserver.equals(ipstate.zserver) : ipstate.zserver != null) return false;
        if (port != null ? !port.equals(ipstate.port) : ipstate.port != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idipstate;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gzone != null ? gzone.hashCode() : 0);
        result = 31 * result + (zserver != null ? zserver.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        return result;
    }
}
