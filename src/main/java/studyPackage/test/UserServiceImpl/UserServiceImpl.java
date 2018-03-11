package studyPackage.test.UserServiceImpl;

import studyPackage.test.entity.User;
import studyPackage.test.UserMapper.UserDao;
import studyPackage.test.UserService.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
