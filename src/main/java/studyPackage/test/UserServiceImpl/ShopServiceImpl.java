package studyPackage.test.UserServiceImpl;

import studyPackage.test.entity.Shop;
import studyPackage.test.UserMapper.ShopDao;
import studyPackage.test.UserService.ShopService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统商品表 服务实现类
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-11
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopDao, Shop> implements ShopService {

}
