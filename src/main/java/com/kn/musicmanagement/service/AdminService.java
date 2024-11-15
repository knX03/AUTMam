package com.kn.musicmanagement.service;


import com.kn.musicmanagement.pojo.Admin;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AdminService {

    /*登录验证*/
    Boolean loginVerify(String admin_email, String admin_password);

    String selectIDByEmail(String admin_Email);

    /**
     * 保存管理员
     *
     * @param admin
     * @return
     */
    Boolean save(Admin admin);

    /**
     * 根据管理员iD查找详情
     *
     * @param admin_ID
     * @return
     */
    Admin detailByAdminID(String admin_ID);


}
