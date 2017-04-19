package com.izhimi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izhimi.service.TestService;

/**
 * @author izhimi
 */
@RestController
public class IndexController {

    @Autowired
    private TestService testService;

    //add  job
    @RequestMapping("addJob.html")
    public String addJob(Model model) {
        boolean result = testService.addDynamicJob();
        return String.valueOf(result);
    }

    //remove  job
    @RequestMapping("removeJob.html")
    public String removeJob() {
        testService.removeJob();
        return "";
    }
}
