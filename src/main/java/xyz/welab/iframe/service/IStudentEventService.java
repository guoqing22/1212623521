package xyz.welab.iframe.service;

import xyz.welab.iframe.pojo.MyJss;

import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 20:22
 * @Description:
 **/
public interface IStudentEventService {

    public List<MyJss> yuxikecheng(Date start_date, Date end_date);

    public List<MyJss> kechengwancheng(Date start_date, Date end_date);

    public List<MyJss> kechengfuxi(Date start_date, Date end_date);

    public List<MyJss> wanchegnzuoye(Date start_date, Date end_date);
}
