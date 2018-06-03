package xyz.welab.iframe.service;

import xyz.welab.iframe.pojo.MyJss;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 13:43
 * @Description:
 **/
public interface IParentService {

    public List<MyJss> getNum(Date start_date, Date end_date);

    public List<MyJss> yuyueshiting(Date start_date, Date end_date);

    public List<MyJss> shitingwancheng(Date start_date, Date end_date);

    public List<MyJss> shoucifufei(Date start_date, Date end_date);
}
