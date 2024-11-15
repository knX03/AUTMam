package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.mapper.AdminMapper;
import com.kn.musicmanagement.pojo.Admin;
import com.kn.musicmanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Boolean loginVerify(String admin_email, String admin_password) {
        String password = adminMapper.selectPasswordByEmail(admin_email);
        return admin_password.equals(password);
    }

    @Override
    public String selectIDByEmail(String admin_Email) {
        String admin_ID = adminMapper.selectAdminIDByEmail(admin_Email);
        return admin_ID;
    }

    @Override
    public Boolean save(Admin admin) {
        return null;
    }

    @Override
    public Admin detailByAdminID(String admin_ID) {
        return adminMapper.detailByAdminID(admin_ID);
    }
}
