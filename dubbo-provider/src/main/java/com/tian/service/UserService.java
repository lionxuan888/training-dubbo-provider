package com.tian.service;

import org.springframework.stereotype.Service;

/**
 * Created by logan on 2020/3/12.
 */
@Service
public class UserService implements IUserService{

    public String helloDubbo() {
        return "hello";
    }
}
