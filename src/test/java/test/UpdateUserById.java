package test;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.springmvc.model.system.Shop;
import com.baomidou.springmvc.service.system.ShopService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/mybatis/system/*.xml","classpath:/mybatis/*.xml","classpath:/spring/spring*.xml"})
public class UpdateUserById {
    @Autowired
    private ShopService shopService;
    @Test
    public void updateById(){
        int result=0;
        Shop shop=new Shop();
        shop.setDes("西瓜");
        EntityWrapper<Shop> entityWrapper=new EntityWrapper<Shop>();
        entityWrapper.setEntity(shop);
        entityWrapper.where("des={0}","'香蕉'").and("id=1");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+shopService.update(shop,entityWrapper));
        System.out.println(entityWrapper.getSqlSegment());

    }
    @Test
    public void studyEntityWrapper(){
        EntityWrapper<Shop> entityWrapper=new EntityWrapper<>();
        entityWrapper.like("des","香");
        System.out.println(">>>>>>>"+shopService.selectList(entityWrapper));
    }
    @Test
    public void testMyPage(){
        EntityWrapper<Shop> entityWrapper=new EntityWrapper();
        entityWrapper.like("des","西瓜");

        RowBounds rowBounds=new RowBounds(3,2);
        System.out.println(">>>>>"+shopService.selectMypage(rowBounds, entityWrapper));
    }
    @Test
    public void piliang(){
        List<Shop> shopList=new ArrayList<>();
        Shop shop=new Shop();
        shop.setDes("香蕉");
        shop.setId(2l);
        shopList.add(shop);
        System.out.println(">>>>>>>>>>"+shopService.updateBatchById(shopList));
    }
    @Test
    public void piliangAdd(){
        List<Shop> shopList=new ArrayList<>();
        Shop shop=null;
        for(int i=0;i<100;i++){
            shop=new Shop();
            shop.setDes("苹果"+i);
            shopList.add(shop);
        }
        System.out.println("批量新增操作"+shopService.insertBatch(shopList));
    }
}
