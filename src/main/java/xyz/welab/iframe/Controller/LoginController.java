package xyz.welab.iframe.Controller;

import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.welab.iframe.pojo.Staff;
import xyz.welab.iframe.service.impl.AdminServiceImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 10:35
 * @Description:登陆Controller
 **/
@Api("loginController相关api")
@Controller
@RequestMapping("/")
public class LoginController {

    private static Logger LOGGER = LogManager.getLogger(LoginController.class);

    @Resource
    private AdminServiceImpl adminService;


    @ApiOperation(value="登陆连接接口", notes="返回code代码（600，601，602），用户密码存放在session中，前端可根据session中是否有值判断是否需要登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "staff_id", value = "用户ID", required = true, dataType = "java.lang.Long"),
            @ApiImplicitParam(name = "staff_password", value = "用户密码", required = true, dataType = "java.lang.String")
    })
    @ApiResponses({
            @ApiResponse(code=200,message="返回消息code代码（600，601，602）"),
            @ApiResponse(code=600,message="用户名密码正确"),
            @ApiResponse(code=601,message="用户名不存在"),
            @ApiResponse(code=602,message="用户密码错误"),
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getconnection",method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer,String> role(@Param("staff_id") Integer staff_id,@Param("staff_password") String staff_password,HttpServletRequest request){
        LOGGER.info("用户名："+staff_id+"\n"+"密码："+staff_password);
        Integer code;
        String message;
        if (!adminService.isExistID(staff_id)){
            code = 601;
            message = "用户名不存在";
        }
        else if (!adminService.isExistUser(staff_id,staff_password)){
            code = 602;
            message = "用户密码不对";
        }
        else {
            code = 600;
            message = "用户密码正确";

            Staff staff = adminService.getUser(staff_id,staff_password);
            HttpSession session = request.getSession();
            session.setAttribute("staff_id",staff.getStaffId());
            session.setAttribute("staff_password",staff.getStaffPassword());
        }
        Map<Integer,String> msg = new HashMap<>();
        msg.put(code,message);
        return msg;
    }

    /**
     * 注销
     * @param request
     * @param response
     * @param session
     * @throws ServletException
     * @throws IOException
     */
    @ApiOperation(value="注销", notes="")
    @RequestMapping(value="/logout",method = RequestMethod.POST)
    public void logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        session.invalidate();
    }
}
