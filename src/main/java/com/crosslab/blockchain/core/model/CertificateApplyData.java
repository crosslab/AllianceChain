package com.crosslab.blockchain.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name="certificate")
public class CertificateApplyData extends BaseEntity {

   private String licenseNum;
   private String mandatorCompany;
   private String tradePlatform;
   private String tradePlatformVersion;
   private String deployContext;
   private String runContext;
   private String runState;
   private String applyTime;
   private String masterId;
   private String masterName;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getMandatorCompany() {
        return mandatorCompany;
    }

    public void setMandatorCompany(String mandatorCompany) {
        this.mandatorCompany = mandatorCompany;
    }

    public String getTradePlatform() {
        return tradePlatform;
    }

    public void setTradePlatform(String tradePlatform) {
        this.tradePlatform = tradePlatform;
    }

    public String getTradePlatformVersion() {
        return tradePlatformVersion;
    }

    public void setTradePlatformVersion(String tradePlatformVersion) {
        this.tradePlatformVersion = tradePlatformVersion;
    }

    public String getDeployContext() {
        return deployContext;
    }

    public void setDeployContext(String deployContext) {
        this.deployContext = deployContext;
    }

    public String getRunContext() {
        return runContext;
    }

    public void setRunContext(String runContext) {
        this.runContext = runContext;
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"licenseNum\":\"")
                .append(licenseNum).append('\"');
        sb.append(",\"mandatorCompany\":\"")
                .append(mandatorCompany).append('\"');
        sb.append(",\"tradePlatform\":\"")
                .append(tradePlatform).append('\"');
        sb.append(",\"tradePlatformVersion\":\"")
                .append(tradePlatformVersion).append('\"');
        sb.append(",\"deployContext\":\"")
                .append(deployContext).append('\"');
        sb.append(",\"runContext\":\"")
                .append(runContext).append('\"');
        sb.append(",\"runState\":\"")
                .append(runState).append('\"');
        sb.append(",\"applyTime\":\"")
                .append(applyTime).append('\"');
        sb.append(",\"masterId\":\"")
                .append(masterId).append('\"');
        sb.append(",\"masterName\":\"")
                .append(masterName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
