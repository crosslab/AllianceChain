package com.crosslab.blockchain.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name="fileCheckData")
public class FileCheckData extends BaseEntity {

    private String licenseNum;
    private String mandatorCompany;
    private String tradePlatform;
    private String tradePlatformVersion;
    private String certificationAgencyNum;
    private String certificationAgencyName;
    private String fileCheckResult;
    private String checkTime;
    private String checkManId;
    private String getCheckManName;
    private String encryptPrivateKey;
    private String uploadManId;
    private String getUploadManName;

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

    public String getCertificationAgencyNum() {
        return certificationAgencyNum;
    }

    public void setCertificationAgencyNum(String certificationAgencyNum) {
        this.certificationAgencyNum = certificationAgencyNum;
    }

    public String getCertificationAgencyName() {
        return certificationAgencyName;
    }

    public void setCertificationAgencyName(String certificationAgencyName) {
        this.certificationAgencyName = certificationAgencyName;
    }

    public String getFileCheckResult() {
        return fileCheckResult;
    }

    public void setFileCheckResult(String fileCheckResult) {
        this.fileCheckResult = fileCheckResult;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckManId() {
        return checkManId;
    }

    public void setCheckManId(String checkManId) {
        this.checkManId = checkManId;
    }

    public String getGetCheckManName() {
        return getCheckManName;
    }

    public void setGetCheckManName(String getCheckManName) {
        this.getCheckManName = getCheckManName;
    }

    public String getEncryptPrivateKey() {
        return encryptPrivateKey;
    }

    public void setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
    }

    public String getUploadManId() {
        return uploadManId;
    }

    public void setUploadManId(String uploadManId) {
        this.uploadManId = uploadManId;
    }

    public String getGetUploadManName() {
        return getUploadManName;
    }

    public void setGetUploadManName(String getUploadManName) {
        this.getUploadManName = getUploadManName;
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
        sb.append(",\"certificationAgencyNum\":\"")
                .append(certificationAgencyNum).append('\"');
        sb.append(",\"certificationAgencyName\":\"")
                .append(certificationAgencyName).append('\"');
        sb.append(",\"fileCheckResult\":\"")
                .append(fileCheckResult).append('\"');
        sb.append(",\"checkTime\":\"")
                .append(checkTime).append('\"');
        sb.append(",\"checkManId\":\"")
                .append(checkManId).append('\"');
        sb.append(",\"getCheckManName\":\"")
                .append(getCheckManName).append('\"');
        sb.append(",\"encryptPrivateKey\":\"")
                .append(encryptPrivateKey).append('\"');
        sb.append(",\"uploadManId\":\"")
                .append(uploadManId).append('\"');
        sb.append(",\"getUploadManName\":\"")
                .append(getUploadManName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
