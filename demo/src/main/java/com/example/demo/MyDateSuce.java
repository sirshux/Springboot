package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
//@ConfigurationProperties("user")
@Controller
public class MyDateSuce {
    private String da;
    private String kk;
    private String ll;
    private String ko;

    @Override
    public String toString() {
        return "MyDateSuce{" +
                "da='" + da + '\'' +
                ", kk='" + kk + '\'' +
                ", ll='" + ll + '\'' +
                ", ko='" + ko + '\'' +
                '}';
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public String getLl() {
        return ll;
    }

    public void setLl(String ll) {
        this.ll = ll;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }
}
