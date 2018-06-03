package xyz.welab.iframe.service;

import xyz.welab.iframe.pojo.Staff;

/**
 * @package: xyz.welab.iframe.service
 * @author: qing
 * @date: 2018/3/14
 * @time: 14:31
 **/
public interface IAdminService {
    /**
     * 通过id查找用户
     * @param staff_id 管理员id
     * @return
     */
    public Staff getUserById(Integer staff_id);

    /**
     * 通过用户名密码查找用户
     * @param staff_id 用户名
     * @param staff_password 密码
     * @return
     */
    public Staff getUser(Integer staff_id,String staff_password);

    /**
     * 判断用户名是否存在
     * @param staff_id 用户名
     * @return
     */
    public boolean isExistID(Integer staff_id);

    /**
     * 判断用户名密码是否正确
     * @param staff_id 用户名
     * @param staff_password 密码
     * @return
     */
    public boolean isExistUser(Integer staff_id,String staff_password);
}
