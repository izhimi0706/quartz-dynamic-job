package com.izhimi.service.impl;

import java.util.UUID;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.izhimi.service.TestService;
import com.izhimi.service.scheduler.TargetDynamicJob;
import com.izhimi.service.scheduler.dynamic.DynamicJob;
import com.izhimi.service.scheduler.dynamic.DynamicSchedulerFactory;

/**
 * @author izhimi
 */
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    /*
     * 添加一个动态的JOB
     */
    public boolean addDynamicJob() {
        DynamicJob dynamicJob = createDynamicJob();
        dynamicJob.addJobData("uuuid", UUID.randomUUID().toString());//transfer parameter

        try {
            DynamicSchedulerFactory.registerJob(dynamicJob);
        } catch (SchedulerException e) {
            throw new IllegalStateException(e);
        }

        return true;
    }

    /*
     * 删除一个JOB
     */
    public void removeJob() {
        final DynamicJob dynamicJob = createDynamicJob();
        try {
            final boolean result = DynamicSchedulerFactory.removeJob(dynamicJob);
            LOGGER.info("Remove DynamicJob [{}] result: {}", dynamicJob, result);
        } catch (SchedulerException e) {
            throw new IllegalStateException(e);
        }
    }

    //创建 一个动态的JOB, 测试用
    private DynamicJob createDynamicJob() {
        return new DynamicJob("test-")
        //动态定时任务的 cron,  每10秒执行一次
                .cronExpression("0/10 * * * * ?").target(TargetDynamicJob.class);
    }
}
