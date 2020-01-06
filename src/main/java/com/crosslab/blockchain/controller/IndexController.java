package com.crosslab.blockchain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crosslab.blockchain.block.check.YLBlockChecker;
import com.crosslab.blockchain.core.manager.DbBlockManager;
import com.crosslab.blockchain.core.manager.MessageManager;
import com.crosslab.blockchain.core.manager.SyncManager;
import com.crosslab.blockchain.core.repository.UserRepository;
import com.crosslab.blockchain.core.service.BlockService;
import com.crosslab.blockchain.core.service.InstructionService;
import com.crosslab.blockchain.socket.client.PacketSender;

import javax.annotation.Resource;

/**
 * Created by crosslab on 2019/3/18.
 */
@Controller
public class IndexController {
    @Resource
    UserRepository userRepository;
    @Resource
    private BlockService blockService;
    @Resource
    private PacketSender packetSender;
    @Resource
    private DbBlockManager dbBlockManager;
    @Resource
    private InstructionService instructionService;
    @Resource
    private SyncManager syncManager;
    @Resource
    private MessageManager messageManager;
    @Resource
    private YLBlockChecker yLBlockChecker;
    @Value("${publicKey:A8WLqHTjcT/FQ2IWhIePNShUEcdCzu5dG+XrQU8OMu54}")
    private String publicKey;
    @Value("${privateKey:yScdp6fNgUU+cRUTygvJG4EBhDKmOMRrK4XJ9mKVQJ8=}")
    private String privateKey;
    @RequestMapping("/welcome")
    public ModelAndView indexPage(){
//       System.out.println("-----------------------------------------------=========================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
     //   modelAndView.addObject("message", "Hello World, Hello Kitty");
        return modelAndView;
    }

    @RequestMapping("/login")
    public String login() throws Exception {
//        InstructionBody instructionBody = new InstructionBody();
//        instructionBody.setOperation(Operation.ADD);
//        instructionBody.setTable("user");
//        instructionBody.setJson("{\"name\":\"" + "666" + "\",\"password\":\""+"1234"+"\"}");
//        /*instructionBody.setPublicKey("A8WLqHTjcT/FQ2IWhIePNShUEcdCzu5dG+XrQU8OMu54");
//        instructionBody.setPrivateKey("yScdp6fNgUU+cRUTygvJG4EBhDKmOMRrK4XJ9mKVQJ8=");*/
//        instructionBody.setPublicKey(publicKey);
//        instructionBody.setPrivateKey(privateKey);
//        Instruction instruction = instructionService.build(instructionBody);
//
//        BlockRequestBody blockRequestBody = new BlockRequestBody();
//        blockRequestBody.setPublicKey(instructionBody.getPublicKey());
//        com.crosslab.blockchain.block.BlockBody blockBody = new com.crosslab.blockchain.block.BlockBody();
//        blockBody.setInstructions(CollectionUtil.newArrayList(instruction));
//
//        blockRequestBody.setBlockBody(blockBody);
//        blockService.addBlock(blockRequestBody);
//        System.out.print(blockBody.toString());
        return "login";

    }

    @RequestMapping("/showcharts")
    public String showCharts(){
        return "charts";
    }
}
