package com.kn.musicmanagement.service;

import com.kn.musicmanagement.Utils.JavaMailUntil;
import com.kn.musicmanagement.pojo.User;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Service
public class EmailSendService {

    public Boolean sendCode(String userEmail, String code) throws MessagingException {
        //	创建Session会话
        Session session = JavaMailUntil.createSession();
        System.out.println(userEmail + ":" + code);
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        message.setSubject("AUT音乐");
        message.setText("您的验证码为：" + "<strong> " + code + "</strong>！" + "\n有效期5分钟。");
        message.setFrom(new InternetAddress("x15007623521@163.com"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
        System.out.println(message);
        //发送
        Transport.send(message);

        return true;
    }

    public Boolean sendApprovedSong(User user, String songName) throws MessagingException {
        String userEmail = user.getUser_Email();
        //	创建Session会话
        Session session = JavaMailUntil.createSession();
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        message.setSubject("AUT音乐");
        message.setText("您的发布的歌曲：" + songName + ",通过了审核。" + "\n😀");
        message.setFrom(new InternetAddress("x15007623521@163.com"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
        System.out.println(message);
        //发送
        Transport.send(message);
        return true;
    }

    public Boolean sendArriveSongMess(User user, String songName) throws MessagingException {
        String userEmail = user.getUser_Email();
        //	创建Session会话
        Session session = JavaMailUntil.createSession();
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        message.setSubject("AUT音乐");
        message.setText("您的歌曲:" + songName + ",已重新发布。😀");
        message.setFrom(new InternetAddress("x15007623521@163.com"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
        System.out.println(message);
        //发送
        Transport.send(message);
        return true;
    }
}
