package com.tian.controller;

import com.tian.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by logan on 2020/3/11.
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        testService.test();
      return "hello server";
    }

}
