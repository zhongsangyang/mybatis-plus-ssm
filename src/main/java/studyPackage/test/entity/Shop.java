package studyPackage.test.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统商品表
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-11
 */
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 描述
     */
    private String des;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 生产开始时期
     */
    @TableField("shop_start_time")
    private Date shopStartTime;
    /**
     * 生产结束时期
     */
    @TableField("shop_end_time")
    private Date shopEndTime;
    /**
     * 商品类型
     */
    @TableField("shop_type")
    private String shopType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getShopStartTime() {
        return shopStartTime;
    }

    public void setShopStartTime(Date shopStartTime) {
        this.shopStartTime = shopStartTime;
    }

    public Date getShopEndTime() {
        return shopEndTime;
    }

    public void setShopEndTime(Date shopEndTime) {
        this.shopEndTime = shopEndTime;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    @Override
    public String toString() {
        return "Shop{" +
        ", id=" + id +
        ", des=" + des +
        ", price=" + price +
        ", shopStartTime=" + shopStartTime +
        ", shopEndTime=" + shopEndTime +
        ", shopType=" + shopType +
        "}";
    }
}
