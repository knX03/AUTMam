package com.kn.musicmanagement.controller;

import com.kn.musicmanagement.pojo.Admin;
import com.kn.musicmanagement.service.AdminService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class adminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/detailByAdminID")
    public Result detailByAdminID(@RequestParam String admin_ID) {
        Result result = new Result();
        Admin admin = adminService.detailByAdminID(admin_ID);
        result.setCode(200);
        result.setData(admin);
        return result;
    }

    /*登录接口*/
    @PostMapping("/adminLogin")
    public Result loginUser(HttpServletResponse response, @RequestBody Map<String, Object> map) {
        Result result = new Result();
        String email = (String) map.get("admin_Email");
        String password = (String) map.get("admin_Password");
        Boolean remFlag = (Boolean) map.get("remFlag");
        /*空值判断*/
        if (email.isEmpty() || email == null) {
            result.setCode(402);
            result.setFlag(false);
            result.setData("账号为空，请先输入账号！");
            return result;
        } else if (password.isEmpty() || password == null) {
            result.setCode(402);
            result.setFlag(false);
            result.setData("密码为空，请先输入密码！");
            return result;
        }
        Boolean flag = adminService.loginVerify(email, password);
        if (flag) {
            if (remFlag) {

                Cookie cUserEmail = new Cookie("admin_Email", email);
                Cookie cPassword = new Cookie("admin_Password", password);
                //设置Cookie存活时间
                cUserEmail.setMaxAge(60 * 60 * 24 * 7);
                cPassword.setMaxAge(60 * 60 * 24 * 7);

                //发送Cookie
                response.addCookie(cUserEmail);
                response.addCookie(cPassword);
            }
            String admin_ID = adminService.selectIDByEmail(email);
            result.setCode(200);
            result.setFlag(flag);
            result.setData(admin_ID);
            result.setMsg("登录成功！");
        } else {
            result.setCode(200);
            result.setFlag(flag);
            result.setData("error");
            result.setMsg("账号或密码错误，请重试！");
        }

        return result;
    }
}
