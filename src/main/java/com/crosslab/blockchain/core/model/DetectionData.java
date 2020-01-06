package com.crosslab.blockchain.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name="detection")
public class DetectionData extends BaseEntity {

    private String agencyManNum;
    private String agencyManName;
    private String tradePlateformName;
    private String getTradePlateformVersion;
    private String checkAgencyNum;
    private String checkAgencyName;
    private String checkResult;
    private String checkTime;
    private String checkManId;
    private String checkManName;
    private String privateKeyDataAbastrat;
    private String uploadManId;
    private String getUploadManName;

    public String getAgencyManNum() {
        return agencyManNum;
    }

    public void setAgencyManNum(String agencyManNum) {
        this.agencyManNum = agencyManNum;
    }

    public String getAgencyManName() {
        return agencyManName;
    }

    public void setAgencyManName(String agencyManName) {
        this.agencyManName = agencyManName;
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

    public String getCheckAgencyNum() {
        return checkAgencyNum;
    }

    public void setCheckAgencyNum(String checkAgencyNum) {
        this.checkAgencyNum = checkAgencyNum;
    }

    public String getCheckAgencyName() {
        return checkAgencyName;
    }

    public void setCheckAgencyName(String checkAgencyName) {
        this.checkAgencyName = checkAgencyName;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
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

    public String getCheckManName() {
        return checkManName;
    }

    public void setCheckManName(String checkManName) {
        this.checkManName = checkManName;
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
        sb.append("\"agencyManNum\":\"")
                .append(agencyManNum).append('\"');
        sb.append(",\"agencyManName\":\"")
                .append(agencyManName).append('\"');
        sb.append(",\"tradePlateformName\":\"")
                .append(tradePlateformName).append('\"');
        sb.append(",\"getTradePlateformVersion\":\"")
                .append(getTradePlateformVersion).append('\"');
        sb.append(",\"checkAgencyNum\":\"")
                .append(checkAgencyNum).append('\"');
        sb.append(",\"checkAgencyName\":\"")
                .append(checkAgencyName).append('\"');
        sb.append(",\"checkResult\":\"")
                .append(checkResult).append('\"');
        sb.append(",\"checkTime\":\"")
                .append(checkTime).append('\"');
        sb.append(",\"checkManId\":\"")
                .append(checkManId).append('\"');
        sb.append(",\"checkManName\":\"")
                .append(checkManName).append('\"');
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
