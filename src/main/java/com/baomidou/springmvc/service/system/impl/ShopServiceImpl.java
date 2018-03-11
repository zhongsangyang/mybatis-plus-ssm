package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.mapper.system.ShopMapper;
import com.baomidou.springmvc.model.system.Shop;
import com.baomidou.springmvc.service.system.ShopService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统商品表 服务实现类
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-10
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService {

    public Page<Shop> selectShopList(Page<Shop> page, String state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        return page.setRecords(baseMapper.selectShopList(page,state));
    }

    @Override
    public List<Shop> selectMypage(RowBounds rowBounds,Wrapper<Shop> wrapper) {
        return baseMapper.selectMypage(rowBounds,wrapper);
    }


}
