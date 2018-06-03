package xyz.welab.iframe.service.impl;

import org.springframework.stereotype.Service;
import xyz.welab.iframe.model.StaffMapper;
import xyz.welab.iframe.pojo.Staff;
import xyz.welab.iframe.service.IAdminService;

import javax.annotation.Resource;

/**
 * @package: xyz.welab.iframe.service.impl
 * @author: qing
 * @date: 2018/3/14
 * @time: 14:34
 **/
@Service("adminService")
public class AdminServiceImpl implements IAdminService {
    @Resource
    private StaffMapper staffMapper;

    /**
     * @param staff_id 管理员id
     * @return
     */
    @Override
    public Staff getUserById(Integer staff_id) {
        return null;
    }

    /**
     * @param staff_id       用户名
     * @param staff_password 密码
     * @return
     */
    @Override
    public Staff getUser(Integer staff_id, String staff_password) {
        return null;
    }

    /**
     * @param staff_id 用户名
     * @return
     */
    @Override
    public boolean isExistID(Integer staff_id) {
        Staff staff = staffMapper.selectByPrimaryKey(staff_id);
        if(staff != null){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param staff_id       用户名
     * @param staff_password 密码
     * @return
     */
    @Override
    public boolean isExistUser(Integer staff_id, String staff_password) {
        if (isExistID(staff_id)){
            Staff staff = staffMapper.getRegistCountByDate(staff_id,staff_password);
            if (staff != null){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
