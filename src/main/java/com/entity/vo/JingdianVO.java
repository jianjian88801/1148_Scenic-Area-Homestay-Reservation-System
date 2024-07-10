package com.entity.vo;

import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 景点信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingdian")
public class JingdianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 景点名称
     */

    @TableField(value = "jingdian_name")
    private String jingdianName;


    /**
     * 景点图片
     */

    @TableField(value = "jingdian_photo")
    private String jingdianPhoto;


    /**
     * 景点类型
     */

    @TableField(value = "jingdian_types")
    private Integer jingdianTypes;


    /**
     * 景点价格
     */

    @TableField(value = "jingdian_money")
    private Double jingdianMoney;


    /**
     * 景点数量
     */

    @TableField(value = "jingdian_number")
    private Integer jingdianNumber;


    /**
     * 点击次数
     */

    @TableField(value = "jingdian_clicknum")
    private Integer jingdianClicknum;


    /**
     * 景点详情
     */

    @TableField(value = "jingdian_content")
    private String jingdianContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名称
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点图片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点图片
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点价格
	 */
    public Double getJingdianMoney() {
        return jingdianMoney;
    }


    /**
	 * 获取：景点价格
	 */

    public void setJingdianMoney(Double jingdianMoney) {
        this.jingdianMoney = jingdianMoney;
    }
    /**
	 * 设置：景点数量
	 */
    public Integer getJingdianNumber() {
        return jingdianNumber;
    }


    /**
	 * 获取：景点数量
	 */

    public void setJingdianNumber(Integer jingdianNumber) {
        this.jingdianNumber = jingdianNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getJingdianClicknum() {
        return jingdianClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setJingdianClicknum(Integer jingdianClicknum) {
        this.jingdianClicknum = jingdianClicknum;
    }
    /**
	 * 设置：景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：景点详情
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
