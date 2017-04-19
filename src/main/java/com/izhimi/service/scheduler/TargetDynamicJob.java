package com.izhimi.service.scheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.izhimi.service.impl.TestServiceImpl;

/**
 * @author izhimi
 */
public class TargetDynamicJob implements Job {


    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);
    
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //TODO
        final Object uuuid = context.getMergedJobDataMap().get("uuuid");
        LOGGER.warn("[Target -- Dynamic-Job]  It is " + new Date() + " now, uuuid=" + uuuid);
    }
}