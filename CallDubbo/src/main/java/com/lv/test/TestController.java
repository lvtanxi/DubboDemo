package com.lv.test;

import com.lv.service.DubboService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Date: 2017-04-07
 * Time: 15:48
 * Description:
 */
@RestController
public class TestController {
    @Resource
    private DubboService mDubboService;
    @GetMapping("test")
    public String test(){
        return mDubboService.getUserName();
    }
}
