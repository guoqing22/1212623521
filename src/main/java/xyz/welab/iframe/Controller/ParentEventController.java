package xyz.welab.iframe.Controller;

import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.service.impl.ParentEventServiceImpl;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 18:43
 * @Description:
 **/
@Controller
@Api("Controller相关api")
public class ParentEventController {
    @Resource
    private ParentEventServiceImpl parentEventService;

    @ApiOperation(value="获取约课数量接口", notes="根据日期区间，获得每天的约课数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getOrderNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getNum(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentEventService.yuekecishu(start_date,end_date);
        return myJssList;
    }

    @ApiOperation(value="获取课程改约次数接口", notes="根据日期区间，获得每天的改约数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/courseChange",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> courseChange(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentEventService.gaiyuecishu(start_date,end_date);
        return myJssList;
    }

    @ApiOperation(value="获取课程续费次数接口", notes="根据日期区间，获得每天的续费数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getPaid",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getPaid(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentEventService.xufei(start_date,end_date);
        return myJssList;
    }

    @ApiOperation(value="获取课程退费次数接口", notes="根据日期区间，获得每天的退费数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getRefound",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getRefound(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentEventService.tuifei(start_date,end_date);
        return myJssList;
    }

}
