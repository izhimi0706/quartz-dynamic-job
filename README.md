# quartz-dynamic-job
spring boot dynamic job  

step 1:  代码下载后构建maven 下载jar包

step 2:  启动服务,打开postman get  http://localhost:8080//addJob.html

          输出如下说明job添加成功

          2017-04-19 17:07:20.021  WARN 9568 --- [actory_Worker-1] com.izhimi.service.impl.TestServiceImpl  : [Target -- Dynamic-Job]  
          It is Wed Apr 19 17:07:20 CST 2017 now, uuuid=96a3ca4e-259c-4716-86c5-12417e68153f
          2017-04-19 17:07:30.007  WARN 9568 --- [actory_Worker-2] com.izhimi.service.impl.TestServiceImpl  : [Target -- Dynamic-Job]  
          It is Wed Apr 19 17:07:30 CST 2017 now, uuuid=96a3ca4e-259c-4716-86c5-12417e68153f
          2017-04-19 17:07:40.002  WARN 9568 --- [actory_Worker-3] com.izhimi.service.impl.TestServiceImpl  : [Target -- Dynamic-Job]  
          It is Wed Apr 19 17:07:40 CST 2017 now, uuuid=96a3ca4e-259c-4716-86c5-12417e68153f
          2017-04-19 17:07:50.002  WARN 9568 --- [actory_Worker-4] com.izhimi.service.impl.TestServiceImpl  : [Target -- Dynamic-Job]  
          It is Wed Apr 19 17:07:50 CST 2017 now, uuuid=96a3ca4e-259c-4716-86c5-12417e68153f
          2017-04-19 17:08:00.002  WARN 9568 --- [actory_Worker-5] com.izhimi.service.impl.TestServiceImpl  : [Target -- Dynamic-Job]  
          It is Wed Apr 19 17:08:00 CST 2017 now, uuuid=96a3ca4e-259c-4716-86c5-12417e68153f

