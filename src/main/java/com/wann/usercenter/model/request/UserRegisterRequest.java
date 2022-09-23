package com.wann.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求表单
 *
 * @author wann
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -3389669900805973927L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
