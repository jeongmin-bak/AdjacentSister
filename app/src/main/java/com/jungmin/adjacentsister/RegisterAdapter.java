package com.jungmin.adjacentsister;

public class RegisterAdapter {
    private String tx_age,tx_detail;
    public RegisterAdapter(){
        this.tx_age = "";
        this.tx_detail = "";
    }

    public String getTx_age() {
        return tx_age;
    }

    public void setTx_age(String tx_age) {
        this.tx_age = tx_age;
    }

    public String getTx_detail() {
        return tx_detail;
    }

    public void setTx_detail(String tx_detail) {
        this.tx_detail = tx_detail;
    }

}
