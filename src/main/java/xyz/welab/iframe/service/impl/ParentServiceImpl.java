package xyz.welab.iframe.service.impl;

import org.springframework.stereotype.Service;
import xyz.welab.iframe.model.ParentMapper;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.service.IParentService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 13:44
 * @Description:
 **/
@Service("parentService")
public class ParentServiceImpl implements IParentService {

    @Resource
    private ParentMapper parentMapper;


    @Override
    public List<MyJss> getNum(Date start_date,Date end_date) {
        List<MyJss> myJssList = parentMapper.getNum(start_date,end_date);
System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> yuyueshiting(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentMapper.yuyueshiting(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> shitingwancheng(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentMapper.shitingwancheng(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }

    @Override
    public List<MyJss> shoucifufei(Date start_date, Date end_date) {
        List<MyJss> myJssList = parentMapper.shoucifufei(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myJssList;
    }


}

