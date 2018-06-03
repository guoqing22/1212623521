package xyz.welab.iframe.service;

import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.pojo.MyLlt;
import xyz.welab.iframe.pojo.MyZt;

import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 20:58
 * @Description:
 **/
public interface IStudentSerivce {

    public List<MyLlt> nianling(Date start_date, Date end_date);

    public List<MyLlt> xingbie(Date start_date, Date end_date);

    public List<MyLlt> diqu(Date start_date, Date end_date);

    public List<MyZt> nianlingdengji(Date start_date, Date end_date);

    public List<MyLlt> shangkeshijian(Date start_date, Date end_date);
}
