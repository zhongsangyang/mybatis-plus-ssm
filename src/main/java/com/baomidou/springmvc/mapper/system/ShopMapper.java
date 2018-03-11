package com.baomidou.springmvc.mapper.system;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.springmvc.common.SuperMapper;
import com.baomidou.springmvc.model.system.Shop;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

//http://www.mybatis.org/mybatis-3/zh/sqlmap-xml.html
import java.util.List;
public interface ShopMapper extends SuperMapper<Shop> {
    List<Shop> selectShopList(Pagination page, String state);
    List<Shop> selectMypage(RowBounds rowBounds, @Param("ew")Wrapper<Shop> wrapper);
}
