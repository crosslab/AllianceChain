package com.crosslab.blockchain.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.common.utils.UploadBlockUtil;
import com.crosslab.blockchain.core.model.*;

import javax.annotation.Resource;

@Controller
public class UploadCertificateDataController {//数据上传所有功能模块
    @Value("${publicKey:A8WLqHTjcT/FQ2IWhIePNShUEcdCzu5dG+XrQU8OMu54}")
    private String publicKey;
    @Value("${privateKey:yScdp6fNgUU+cRUTygvJG4EBhDKmOMRrK4XJ9mKVQJ8=}")
    private String privateKey;

    @Resource
    private UploadBlockUtil uploadBlock;


    @RequestMapping("/uploadpage")//证书申请资料上传页面
    public ModelAndView intoUploadPage(){
        CertificateApplyData certificateApplyData = new CertificateApplyData();

        return new ModelAndView("upload_Certificate_Application").addObject(certificateApplyData);
    }

    @RequestMapping("/uploadFile")//文件审核资料上传页面
    public ModelAndView intoUploadFile(){
        FileCheckData fileCheckData = new FileCheckData();

        return new ModelAndView("upload_Document_audit_Application").addObject(fileCheckData);
    }

    @RequestMapping("/uploadCertification")//证书数据上传页面
    public ModelAndView intoUploadCertificationPage(){
        CertificationData certificationData = new CertificationData();

        return new ModelAndView("upload_Certificate_data").addObject(certificationData);
    }

    @RequestMapping("/uploadOnSiteData")//现场审核资料上传页面
    public ModelAndView intoUploadOnSitePage(){
        OnSiteAuditData onSiteAuditData = new OnSiteAuditData();

        return new ModelAndView("upload_Site_audit").addObject(onSiteAuditData);
    }

    @RequestMapping("/detectionPage")//检测检验上传页面
    public ModelAndView intoUploadDetection(){
        DetectionData detectionData = new DetectionData();

        return new ModelAndView("upload_Detection").addObject(detectionData);
    }

    @RequestMapping("/tryRunPage")//检测检验上传页面
    public ModelAndView intoTryRunPage(){
        DetectionData detectionData = new DetectionData();

        return new ModelAndView("upload_test_run").addObject(detectionData);
    }

    @RequestMapping(value = "/applyCertificateUpdate",method = RequestMethod.POST)
    public String applyCertificateUpdate(@ModelAttribute("certificateApplyData")CertificateApplyData certificateApplyData,Model model){
        //HttpSession session=request.getSession();
        uploadBlock.uploadBlock(certificateApplyData.toString(),YLOperation.ADD, "certificate");

        return "/index";

    }

    @RequestMapping(value = "/filecheckupload",method = RequestMethod.POST)
    public String fileCheck(@ModelAttribute("fileCheckData")FileCheckData fileCheckData){
        //HttpSession session=request.getSession();
        uploadBlock.uploadBlock(fileCheckData.toString(),YLOperation.ADD, "file_check_data");

        return "/index";

    }

    @RequestMapping(value = "/uploadCertificateData",method = RequestMethod.POST)
    public String uploadCertificateData(@ModelAttribute("certificationData")CertificationData certificationData){
        //HttpSession session=request.getSession();
        uploadBlock.uploadBlock(certificationData.toString(),YLOperation.ADD, "certificate_data");

        return "/index";

    }

    @RequestMapping(value = "/uploadOnSiteAuditData",method = RequestMethod.POST)
    public String uploadOnSiteAuditData(@ModelAttribute("onSiteAuditData")OnSiteAuditData onSiteAuditData){
        //HttpSession session=request.getSession();

        uploadBlock.uploadBlock(onSiteAuditData.toString(),YLOperation.ADD, "on_site_data");

        return "/index";

    }

    @RequestMapping(value = "/uploadDetectionData",method = RequestMethod.POST)
    public String uploadDetectionData(@ModelAttribute("detectionData")DetectionData detectionData){
        //HttpSession session=request.getSession();

        uploadBlock.uploadBlock(detectionData.toString(),YLOperation.ADD, "detection");

        return "/index";

    }




}
