package xyz.welab.iframe.service;

import xyz.welab.iframe.pojo.MyJss;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 18:18
 * @Description:
 **/
public interface IParentEventService {


    public List<MyJss> yuekecishu(Date start_date, Date end_date);

    public List<MyJss> gaiyuecishu(Date start_date, Date end_date);

    public List<MyJss> tuifei(Date start_date, Date end_date);

    public List<MyJss> xufei(Date start_date, Date end_date);

}
