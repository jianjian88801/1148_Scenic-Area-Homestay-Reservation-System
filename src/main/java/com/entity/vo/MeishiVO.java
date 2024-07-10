package com.entity.vo;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishi")
public class MeishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 美食名称
     */

    @TableField(value = "meishi_name")
    private String meishiName;


    /**
     * 美食图片
     */

    @TableField(value = "meishi_photo")
    private String meishiPhoto;


    /**
     * 美食类型
     */

    @TableField(value = "meishi_types")
    private Integer meishiTypes;


    /**
     * 美食数量
     */

    @TableField(value = "meishi_number")
    private Integer meishiNumber;


    /**
     * 价格
     */

    @TableField(value = "meishi_money")
    private Double meishiMoney;


    /**
     * 点击次数
     */

    @TableField(value = "meishi_clicknum")
    private Integer meishiClicknum;


    /**
     * 美食详情
     */

    @TableField(value = "meishi_content")
    private String meishiContent;


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
	 * 设置：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 获取：美食名称
	 */

    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 设置：美食图片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 获取：美食图片
	 */

    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 设置：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }


    /**
	 * 获取：美食类型
	 */

    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 设置：美食数量
	 */
    public Integer getMeishiNumber() {
        return meishiNumber;
    }


    /**
	 * 获取：美食数量
	 */

    public void setMeishiNumber(Integer meishiNumber) {
        this.meishiNumber = meishiNumber;
    }
    /**
	 * 设置：价格
	 */
    public Double getMeishiMoney() {
        return meishiMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setMeishiMoney(Double meishiMoney) {
        this.meishiMoney = meishiMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 设置：美食详情
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 获取：美食详情
	 */

    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
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
