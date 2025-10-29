package edu.thanglong.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "XeMay")
public class XeMay {

    @Id
    private String bks; // biển kiểm soát (primary key)
    private String mauXe;
    private String chuPhuongTien;

    public XeMay() {}

    public XeMay(String bks, String mauXe, String chuPhuongTien) {
        this.bks = bks;
        this.mauXe = mauXe;
        this.chuPhuongTien = chuPhuongTien;
    }

    public String getBks() {
        return bks;
    }

    public void setBks(String bks) {
        this.bks = bks;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getChuPhuongTien() {
        return chuPhuongTien;
    }

    public void setChuPhuongTien(String chuPhuongTien) {
        this.chuPhuongTien = chuPhuongTien;
    }
}
