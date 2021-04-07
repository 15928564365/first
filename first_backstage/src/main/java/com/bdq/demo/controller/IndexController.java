package com.bdq.demo.controller;

import com.bdq.demo.common.CommonResult;
import com.bdq.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: bdq
 * @Date: 16:40 2021/4/6
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/queryData",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryData(){
        return CommonResult.getSuccessResult("查询成功",new User(2,"校验没毛斌","sdklfj"));
    }
}
