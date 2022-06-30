package com.bytecode.cforcoding;

public class model {
    String filename,fileurl;
    int nod,nol,nov;

    public model() {
    }

    public model(String filename, String fileurl, int nod, int nol, int nov) {
        this.filename = filename;
        this.fileurl = fileurl;
        this.nod = nod;
        this.nol = nol;
        this.nov = nov;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public int getNod() {
        return nod;
    }

    public void setNod(int nod) {
        this.nod = nod;
    }

    public int getNol() {
        return nol;
    }

    public void setNol(int nol) {
        this.nol = nol;
    }

    public int getNov() {
        return nov;
    }

    public void setNov(int nov) {
        this.nov = nov;
    }
}
