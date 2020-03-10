package cn.jxufe.web.admin.service;

import cn.jxufe.web.entity.Admin;
import cn.jxufe.web.entity.User;

public interface SystemService {

    long getBookCount();

    long getUserCount();

    long getOrderCount();

    int loginCheck(String username, String password);

    Admin queryAdminInfo(String username);

}