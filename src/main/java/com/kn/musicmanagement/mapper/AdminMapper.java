package com.kn.musicmanagement.mapper;

import com.kn.musicmanagement.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    /**
     * 根据管理员iD查找详情
     *
     * @param admin_ID
     * @return
     */
    Admin detailByAdminID(String admin_ID);

    /**
     * 登录验证
     *
     * @param admin_Email
     * @return
     */
    String selectPasswordByEmail(String admin_Email);

    /**
     * 获取user_ID
     * @param admin_Email
     * @return
     */
    String selectAdminIDByEmail(String admin_Email);
}
