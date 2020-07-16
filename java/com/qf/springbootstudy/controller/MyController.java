package com.qf.springbootstudy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class MyController {
    @RequestMapping(value = "/demo")
    public String demo(Model model) {
        return "demo";
    }
    /**
     * 任务执行方法（在实际应用中要改成自己的逻辑代码）
     *Title: execute
     *author:liuxuli
     *Description:
     　 * @param request
     　 * @return
     */
    @RequestMapping(value = "/execute")
    @ResponseBody
    public String execute(HttpServletRequest request) {

        for (int i = 0; i <= 100; i++) {
            //for循环只是个例子，在实际业务中百分比要进行实际的计算，这里的i就当是百分比
            //将进度值存储到session中
            request.getSession().setAttribute("processvalue", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return "success";
    }
    /**
     * 获取session中的进度值
     *Title: getprocess
     *author:liuxuli
     *Description:
     　 * @param request
     　 * @return
     */
    @RequestMapping(value = "/getprocess")
    @ResponseBody
    public String  getprocess(HttpServletRequest request) {
        //从session将执行进度值取出来并返回给用户
        System.err.println(request.getSession().getAttribute("processvalue"));
        String processvalue = (String) request.getSession().getAttribute("processvalue");
        return processvalue;
    }
}
