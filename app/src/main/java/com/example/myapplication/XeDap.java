package com.example.myapplication;

public class XeDap {
    String txtten;
    String txtgia;
    String txtgiagoc;
    int sanpham;

    public XeDap(String txtten, String txtgia, String txtgiagoc, int sanpham) {
        this.txtten = txtten;
        this.txtgia = txtgia;
        this.txtgiagoc = txtgiagoc;
        this.sanpham = sanpham;
    }

    public String getTxtten() {
        return txtten;
    }

    public void setTxtten(String txtten) {
        this.txtten = txtten;
    }

    public String getTxtgia() {
        return txtgia;
    }

    public void setTxtgia(String txtgia) {
        this.txtgia = txtgia;
    }

    public String getTxtgiagoc() {
        return txtgiagoc;
    }

    public void setTxtgiagoc(String txtgiagoc) {
        this.txtgiagoc = txtgiagoc;
    }

    public int getSanpham() {
        return sanpham;
    }

    public void setSanpham(int sanpham) {
        this.sanpham = sanpham;
    }
}
