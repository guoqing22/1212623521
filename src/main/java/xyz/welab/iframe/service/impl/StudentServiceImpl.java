package xyz.welab.iframe.service.impl;

import org.springframework.stereotype.Service;
import xyz.welab.iframe.model.StudentMapper;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.pojo.MyLlt;
import xyz.welab.iframe.pojo.MyZt;
import xyz.welab.iframe.service.IStudentSerivce;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 20:59
 * @Description:
 **/
@Service("StudentService")
public class StudentServiceImpl implements IStudentSerivce {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<MyLlt> nianling(Date start_date, Date end_date) {
        List<MyLlt> myLltList = studentMapper.nianling(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myLltList;
    }

    @Override
    public List<MyLlt> xingbie(Date start_date, Date end_date) {
        List<MyLlt> myLltList = studentMapper.xingbie(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myLltList;
    }

    @Override
    public List<MyLlt> diqu(Date start_date, Date end_date) {
        List<MyLlt> myLltList = studentMapper.diqu(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myLltList;
    }

    @Override
    public List<MyZt> nianlingdengji(Date start_date, Date end_date) {
        List<MyZt> myZtList = studentMapper.nianlingdengji(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myZtList;
    }

    @Override
    public List<MyLlt> shangkeshijian(Date start_date, Date end_date) {
        List<MyLlt> myLltList = studentMapper.shangkeshijian(start_date,end_date);
        System.out.println(start_date+"\n"+end_date);
        return myLltList;
    }
}
