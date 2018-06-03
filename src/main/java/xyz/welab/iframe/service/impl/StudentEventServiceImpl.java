package xyz.welab.iframe.service.impl;

import org.springframework.stereotype.Service;
import xyz.welab.iframe.model.StudentEventMapper;
import xyz.welab.iframe.model.StudentMapper;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.service.IStudentEventService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 20:23
 * @Description:
 **/
@Service("studentEventService")
public class StudentEventServiceImpl implements IStudentEventService {

    @Resource
    private StudentEventMapper studentEventMapper;
    @Override
    public List<MyJss> yuxikecheng(Date start_date, Date end_date) {
        List<MyJss> myJssList = studentEventMapper.yuxikecheng(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> kechengwancheng(Date start_date, Date end_date) {
        List<MyJss> myJssList = studentEventMapper.kechengwancheng(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> kechengfuxi(Date start_date, Date end_date) {
        List<MyJss> myJssList = studentEventMapper.kechengfuxi(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> wanchegnzuoye(Date start_date, Date end_date) {
        List<MyJss> myJssList = studentEventMapper.wanchengzuoye(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }
}
