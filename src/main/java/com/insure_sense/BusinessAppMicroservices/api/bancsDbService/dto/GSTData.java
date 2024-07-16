package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.BaseEntity;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.GSTAddr;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.GSTPdctDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.GSTSvcDetails;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
public class GSTData extends BaseEntity {

    public GSTData(Long id, Long orgId, String stjCd, String stj, String lgnm, String dty, String[] nba,
                   String lstupdt, String rgdt, String ctb, String gstin, String sts, String tradeNam,
                   String ctjCd, String ctj, String cxdt) {
        this.id = id;
        this.orgId = orgId;
        this.stjCd = stjCd;
        this.stj = stj;
        this.lgnm = lgnm;
        this.dty = dty;
        this.nba = nba;
        this.lstupdt = lstupdt;
        this.rgdt = rgdt;
        this.ctb = ctb;
        this.gstin = gstin;
        this.sts = sts;
        this.tradeNam = tradeNam;
        this.ctjCd = ctjCd;
        this.ctj = ctj;
        this.cxdt = cxdt;
    }

    private Long id;

    private Long orgId;
    private String stjCd;
    private String stj;
    private String lgnm;
    private String dty;

    private String[] nba;
    private String lstupdt;
    private String rgdt;
    private String ctb;

    private String gstin;
    private String sts;
    private String tradeNam;
    private String ctjCd;
    private String ctj;
    private String cxdt;

    private Set<GSTPdctDetails> bzgddtls = new HashSet<>();
    private Set<GSTSvcDetails> bzsdtls = new HashSet<>();

    private List<GSTAddr> adadr;

    private GSTAddr pradr;

    public String getStjCd() {
        return stjCd;
    }

    public void setStjCd(String stjCd) {
        this.stjCd = stjCd;
    }

    public String getStj() {
        return stj;
    }

    public void setStj(String stj) {
        this.stj = stj;
    }

    public String getLgnm() {
        return lgnm;
    }

    public void setLgnm(String lgnm) {
        this.lgnm = lgnm;
    }

    public String getDty() {
        return dty;
    }

    public void setDty(String dty) {
        this.dty = dty;
    }

    public String[] getNba() {
        return nba;
    }

    public void setNba(String[] nba) {
        this.nba = nba;
    }

    public String getLstupdt() {
        return lstupdt;
    }

    public void setLstupdt(String lstupdt) {
        this.lstupdt = lstupdt;
    }

    public String getRgdt() {
        return rgdt;
    }

    public void setRgdt(String rgdt) {
        this.rgdt = rgdt;
    }

    public String getCtb() {
        return ctb;
    }

    public void setCtb(String ctb) {
        this.ctb = ctb;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getTradeNam() {
        return tradeNam;
    }

    public void setTradeNam(String tradeNam) {
        this.tradeNam = tradeNam;
    }

    public String getCtjCd() {
        return ctjCd;
    }

    public void setCtjCd(String ctjCd) {
        this.ctjCd = ctjCd;
    }

    public String getCtj() {
        return ctj;
    }

    public void setCtj(String ctj) {
        this.ctj = ctj;
    }

    public List<GSTAddr> getAdadr() {
        return adadr;
    }

    public void setAdadr(List<GSTAddr> adadr) {
        this.adadr = adadr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GSTAddr getPradr() {
        return pradr;
    }

    public void setPradr(GSTAddr pradr) {
        this.pradr = pradr;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getCxdt() {
        return cxdt;
    }

    public void setCxdt(String cxdt) {
        this.cxdt = cxdt;
    }

    public Set<GSTPdctDetails> getBzgddtls() {
        return bzgddtls;
    }

    public void setBzgddtls(Set<GSTPdctDetails> bzgddtls) {
        this.bzgddtls = bzgddtls;
    }

    public Set<GSTSvcDetails> getBzsdtls() {
        return bzsdtls;
    }

    public void setBzsdtls(Set<GSTSvcDetails> bzsdtls) {
        this.bzsdtls = bzsdtls;
    }
}
