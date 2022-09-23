package com.wann.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录表单
 *
 * @author wann
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3862157719058865878L;

    private String userAccount;

    private String userPassword;
}
