package xyz.welab.iframe.Controller;

import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.pojo.MyLlt;
import xyz.welab.iframe.pojo.MyZt;
import xyz.welab.iframe.service.impl.StudentEventServiceImpl;
import xyz.welab.iframe.service.impl.StudentServiceImpl;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 20:58
 * @Description:
 **/
@Controller
@Api("StudentEventController相关api")
public class StudentController {
    @Resource
    private StudentServiceImpl studentService;

    @ApiOperation(value="获取年龄分布接口", notes="根据日期区间，获得每个年龄的数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getAgeNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyLlt> getAgeNum(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyLlt> myLltList = studentService.nianling(start_date,end_date);
        return myLltList;
    }

    @ApiOperation(value="获取性别分布接口", notes="根据日期区间，获得每个性别的数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getSexNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyLlt> getSexNum(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyLlt> myLltList = studentService.xingbie(start_date,end_date);
        return myLltList;
    }

    @ApiOperation(value="获取地区分布接口", notes="根据日期区间，获得每个地区的数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getAdressNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyLlt> getAdressNum(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyLlt> myLltList = studentService.diqu(start_date,end_date);
        return myLltList;
    }

    @ApiOperation(value="获取年龄等级接口", notes="根据日期区间")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getLevelNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyZt> getLevelNum(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyZt> myZtList = studentService.nianlingdengji(start_date,end_date);
        return myZtList;
    }

    @ApiOperation(value="获取上课时间分布接口", notes="根据日期区间")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getClassTime",method = RequestMethod.GET)
    @ResponseBody
    public List<MyLlt> getClassTime(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyLlt> myZtList = studentService.shangkeshijian(start_date,end_date);
        return myZtList;
    }
}
