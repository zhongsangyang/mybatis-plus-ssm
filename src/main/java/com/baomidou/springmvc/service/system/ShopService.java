package com.baomidou.springmvc.service.system;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.model.system.Shop;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import sun.security.provider.SHA;

import java.util.List;

/**
 * <p>
 * 系统商品表 服务类
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-10
 */
public interface ShopService extends IService<Shop> {
    Page<Shop> selectShopList(Page<Shop> page, String state) ;
    List<Shop> selectMypage(RowBounds rowBounds, @Param("ew")Wrapper<Shop> wrapper);
}
