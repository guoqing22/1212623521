package xyz.welab.iframe.Controller;

import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.service.impl.ParentServiceImpl;

import javax.annotation.Resource;
import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 10:35
 * @Description:家长行为分析Controller
 **/
@Api("ParentController相关api")
@Controller
public class ParentController {

    @Resource
    private ParentServiceImpl parentService;

    @ApiOperation(value="获取注册数量接口", notes="根据日期区间，获得每天的注册数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getRegistNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getNum(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentService.getNum(start_date,end_date);
        return myJssList;
    }
    @ApiOperation(value="获取预约试听数量接口", notes="根据日期区间，获得每天的预约试听数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getFirstOrderNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getFirstOrderNum(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentService.yuyueshiting(start_date,end_date);
        return myJssList;
    }
    @ApiOperation(value="试听完成接口", notes="根据日期区间，获得每天的试听完成数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getFinishNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getFinishNum(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentService.shitingwancheng(start_date, end_date);
        return myJssList;
    }
    @ApiOperation(value="首次付费接口", notes="根据日期区间，获得每天的首次付费数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getFirstPaidNum",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getFirstPaidNum(@Param("start_date") String startDate,@Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = parentService.shoucifufei(start_date, end_date);
        return myJssList;
    }
}
