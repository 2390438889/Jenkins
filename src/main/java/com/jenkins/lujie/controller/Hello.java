package com.jenkins.lujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *=================================================================================================  
 * 日期		             开发者	       修改类型  	      备注	
 * 2018/11/28			 Hearts         创建	          描述：请输入描述
 *================================================================================================= 
 *  Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 *================================================================================================= 
 */
@Controller
@ResponseBody
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
