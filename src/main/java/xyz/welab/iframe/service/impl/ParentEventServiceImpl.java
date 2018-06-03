package xyz.welab.iframe.service.impl;

import org.springframework.stereotype.Service;
import xyz.welab.iframe.model.ParentEventMapper;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.pojo.ParentEvent;
import xyz.welab.iframe.service.IParentEventService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 18:20
 * @Description:
 **/
@Service("parentEventService")
public class ParentEventServiceImpl implements IParentEventService {

    @Resource
    private ParentEventMapper parentEventMapper;
@Override
    public List<MyJss> yuekecishu(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentEventMapper.yuekecishu(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
        }

    @Override
    public List<MyJss> gaiyuecishu(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentEventMapper.gaiyuecishu(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> tuifei(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentEventMapper.tuifei(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> xufei(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentEventMapper.xufei(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }
}