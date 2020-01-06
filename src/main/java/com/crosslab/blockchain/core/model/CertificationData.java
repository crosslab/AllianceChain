package com.crosslab.blockchain.core.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name="certificateData")
public class CertificationData extends BaseEntity {
    private String licenseNum;
    private String agencyNum;
    private String agencyName;
    private String registerAddress;
    private String tradePlateformName;
    private String getTradePlateformVersion;
    private String website;
    private String checkedAddress;
    private String levelAndRequire;
    private String certificateModel;
    private String certificateConclude;
    private String certificateLevel;
    private String giveDate;
    private String changeDate;
    private String validDate;
    private String certificationAgencyNum;
    private String certificationAgencyName;
    private String cetificateScanHash;
    private String privateKeyDataAbastrat;
    private String uploadManId;
    private String getUploadManName;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getAgencyNum() {
        return agencyNum;
    }

    public void setAgencyNum(String agencyNum) {
        this.agencyNum = agencyNum;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getTradePlateformName() {
        return tradePlateformName;
    }

    public void setTradePlateformName(String tradePlateformName) {
        this.tradePlateformName = tradePlateformName;
    }

    public String getGetTradePlateformVersion() {
        return getTradePlateformVersion;
    }

    public void setGetTradePlateformVersion(String getTradePlateformVersion) {
        this.getTradePlateformVersion = getTradePlateformVersion;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCheckedAddress() {
        return checkedAddress;
    }

    public void setCheckedAddress(String checkedAddress) {
        this.checkedAddress = checkedAddress;
    }

    public String getLevelAndRequire() {
        return levelAndRequire;
    }

    public void setLevelAndRequire(String levelAndRequire) {
        this.levelAndRequire = levelAndRequire;
    }

    public String getCertificateModel() {
        return certificateModel;
    }

    public void setCertificateModel(String certificateModel) {
        this.certificateModel = certificateModel;
    }

    public String getCertificateConclude() {
        return certificateConclude;
    }

    public void setCertificateConclude(String certificateConclude) {
        this.certificateConclude = certificateConclude;
    }

    public String getCertificateLevel() {
        return certificateLevel;
    }

    public void setCertificateLevel(String certificateLevel) {
        this.certificateLevel = certificateLevel;
    }

    public String getGiveDate() {
        return giveDate;
    }

    public void setGiveDate(String giveDate) {
        this.giveDate = giveDate;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
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

    public String getCetificateScanHash() {
        return cetificateScanHash;
    }

    public void setCetificateScanHash(String cetificateScanHash) {
        this.cetificateScanHash = cetificateScanHash;
    }

    public String getPrivateKeyDataAbastrat() {
        return privateKeyDataAbastrat;
    }

    public void setPrivateKeyDataAbastrat(String privateKeyDataAbastrat) {
        this.privateKeyDataAbastrat = privateKeyDataAbastrat;
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
        sb.append(",\"agencyNum\":\"")
                .append(agencyNum).append('\"');
        sb.append(",\"agencyName\":\"")
                .append(agencyName).append('\"');
        sb.append(",\"registerAddress\":\"")
                .append(registerAddress).append('\"');
        sb.append(",\"tradePlateformName\":\"")
                .append(tradePlateformName).append('\"');
        sb.append(",\"getTradePlateformVersion\":\"")
                .append(getTradePlateformVersion).append('\"');
        sb.append(",\"website\":\"")
                .append(website).append('\"');
        sb.append(",\"checkedAddress\":\"")
                .append(checkedAddress).append('\"');
        sb.append(",\"levelAndRequire\":\"")
                .append(levelAndRequire).append('\"');
        sb.append(",\"certificateModel\":\"")
                .append(certificateModel).append('\"');
        sb.append(",\"certificateConclude\":\"")
                .append(certificateConclude).append('\"');
        sb.append(",\"certificateLevel\":\"")
                .append(certificateLevel).append('\"');
        sb.append(",\"giveDate\":\"")
                .append(giveDate).append('\"');
        sb.append(",\"changeDate\":\"")
                .append(changeDate).append('\"');
        sb.append(",\"validDate\":\"")
                .append(validDate).append('\"');
        sb.append(",\"certificationAgencyNum\":\"")
                .append(certificationAgencyNum).append('\"');
        sb.append(",\"certificationAgencyName\":\"")
                .append(certificationAgencyName).append('\"');
        sb.append(",\"cetificateScanHash\":\"")
                .append(cetificateScanHash).append('\"');
        sb.append(",\"privateKeyDataAbastrat\":\"")
                .append(privateKeyDataAbastrat).append('\"');
        sb.append(",\"uploadManId\":\"")
                .append(uploadManId).append('\"');
        sb.append(",\"getUploadManName\":\"")
                .append(getUploadManName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
