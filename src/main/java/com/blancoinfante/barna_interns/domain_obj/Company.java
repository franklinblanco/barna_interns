package com.blancoinfante.barna_interns.domain_obj;

public class Company {
    int id;
    int rnc;
    String legal_name;
    long date_created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRnc() {
        return rnc;
    }

    public void setRnc(int rnc) {
        this.rnc = rnc;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public Company() {
    }

    public Company(int id, int rnc, String legal_name, long date_created) {
        this.id = id;
        this.rnc = rnc;
        this.legal_name = legal_name;
        this.date_created = date_created;
    }
}
