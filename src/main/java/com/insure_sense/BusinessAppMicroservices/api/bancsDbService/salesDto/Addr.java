package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Addr extends BaseEntity {

     public Addr(Long addrId, String bnm, String loc, String st, String bno,
                 String stcd, String dst, String city, String flno, String lt, String pncd,
                 String lg) {
          this.addrId = addrId;
          this.bnm = bnm;
          this.loc = loc;
          this.st = st;
          this.bno = bno;
          this.stcd = stcd;
          this.dst = dst;
          this.city = city;
          this.flno = flno;
          this.lt = lt;
          this.pncd = pncd;
          this.lg = lg;
     }

     private Long addrId;

     @JsonIgnore
     private GSTAddr gstAddr;

     private String bnm;
     private String loc;
     private String st;
     private String bno;
     private String stcd;
     private String dst;
     private String city;
     private String flno;
     private String lt;
     private String pncd;
     private String lg;

     public String getBnm() {
          return bnm;
     }

     public void setBnm(String bnm) {
          this.bnm = bnm;
     }

     public String getLoc() {
          return loc;
     }

     public void setLoc(String loc) {
          this.loc = loc;
     }

     public String getSt() {
          return st;
     }

     public void setSt(String st) {
          this.st = st;
     }

     public String getBno() {
          return bno;
     }

     public void setBno(String bno) {
          this.bno = bno;
     }

     public String getStcd() {
          return stcd;
     }

     public void setStcd(String stcd) {
          this.stcd = stcd;
     }

     public String getDst() {
          return dst;
     }

     public void setDst(String dst) {
          this.dst = dst;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getFlno() {
          return flno;
     }

     public void setFlno(String flno) {
          this.flno = flno;
     }

     public String getLt() {
          return lt;
     }

     public void setLt(String lt) {
          this.lt = lt;
     }

     public String getPncd() {
          return pncd;
     }

     public void setPncd(String pncd) {
          this.pncd = pncd;
     }

     public String getLg() {
          return lg;
     }

     public void setLg(String lg) {
          this.lg = lg;
     }

     public Long getAddrId() {
          return addrId;
     }

     public void setAddrId(Long addrId) {
          this.addrId = addrId;
     }

     public GSTAddr getGstAddr() {
          return gstAddr;
     }

     public void setGstAddr(GSTAddr gstAddr) {
          this.gstAddr = gstAddr;
     }
}
