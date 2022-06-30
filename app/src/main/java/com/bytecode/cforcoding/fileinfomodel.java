package com.bytecode.cforcoding;

public class fileinfomodel {
    String filename,fileurl;
    int nov,nol,nod;

    public int getNov() {
        return nov;
    }

    public void setNov(int nov) {
        this.nov = nov;
    }

    public int getNol() {
        return nol;
    }

    public void setNol(int nol) {
        this.nol = nol;
    }

    public int getNod() {
        return nod;
    }

    public void setNod(int nod) {
        this.nod = nod;
    }

    public fileinfomodel(String filename, String fileurl, int nov, int nol, int nod) {
        this.filename = filename;
        this.fileurl = fileurl;
        this.nov = nov;
        this.nol = nol;
        this.nod = nod;
    }

    public fileinfomodel(String filename, String fileurl) {
        this.filename = filename;
        this.fileurl = fileurl;
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
}
