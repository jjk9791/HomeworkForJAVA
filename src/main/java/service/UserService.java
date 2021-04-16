package service;

import com.baomidou.mybatisplus.extension.service.IService;
import syz.User;

public interface UserService extends IService<User> {
//    /**
//     * 验证登录的方法
//     * @param userCode
//     * @param userPassword
//     * @return
//     */
    User login(String userName, String userPassword);
}
