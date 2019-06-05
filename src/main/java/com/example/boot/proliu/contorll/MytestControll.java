package com.example.boot.proliu.contorll;


import com.example.boot.proliu.service.TestService;
import com.example.boot.proliu.entity.EstimateDish;
import com.example.boot.proliu.entity.InvRetailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/mytest/test")
public class MytestControll {

    @Autowired
    TestService testService;

    @GetMapping("/getTest")
    public List<EstimateDish> getTest(){
        return testService.testliuliuliu();
    }

    @GetMapping("/getConfig")
    public List<InvRetailConfig> fundInv(){
        return testService.fundInv();
    }


}
