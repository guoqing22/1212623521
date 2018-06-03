package xyz.welab.iframe.Controller;

import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.welab.iframe.pojo.MyJss;
import xyz.welab.iframe.service.impl.StudentEventServiceImpl;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 10:36
 * @Description:学生行为分析Controller
 **/
@Controller
@Api("StudentEventController相关api")
public class StudentEventController {

    @Resource
    private StudentEventServiceImpl studentEventService;

    @ApiOperation(value="获取课程预习次数接口", notes="根据日期区间，获得每天的课程预习数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getPreview",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getPreview(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = studentEventService.yuxikecheng(start_date,end_date);
        return myJssList;
    }

    @ApiOperation(value="获取课程完成次数接口", notes="根据日期区间，获得每天的课程完成数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/courseSchduled",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> courseSchduled(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = studentEventService.kechengwancheng(start_date,end_date);
        return myJssList;
    }

    @ApiOperation(value="获取课程复习次数接口", notes="根据日期区间，获得每天的课程复习数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getReview",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> getReview(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = studentEventService.kechengfuxi(start_date,end_date);
        return myJssList;
    }


    @ApiOperation(value="获取完成作业次数接口", notes="根据日期区间，获得每天完成作业数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始日期", example = "2018-06-01",required = true, dataType = "String"),
            @ApiImplicitParam(name = "endDate", value = "结束日期", example = "2018-06-01", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/homeworkFinished",method = RequestMethod.GET)
    @ResponseBody
    public List<MyJss> homeworkFinished(@Param("start_date") String startDate, @Param("end_date") String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date = dateFormat.parse(startDate);
        Date end_date = dateFormat.parse(endDate);
        List<MyJss> myJssList = studentEventService.wanchegnzuoye(start_date,end_date);
        return myJssList;
    }
}
