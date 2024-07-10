package com.entity.model;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 美食名称
     */
    private String meishiName;


    /**
     * 美食图片
     */
    private String meishiPhoto;


    /**
     * 美食类型
     */
    private Integer meishiTypes;


    /**
     * 美食数量
     */
    private Integer meishiNumber;


    /**
     * 价格
     */
    private Double meishiMoney;


    /**
     * 点击次数
     */
    private Integer meishiClicknum;


    /**
     * 美食详情
     */
    private String meishiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 设置：美食名称
	 */
    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 获取：美食图片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 设置：美食图片
	 */
    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 获取：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }


    /**
	 * 设置：美食类型
	 */
    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 获取：美食数量
	 */
    public Integer getMeishiNumber() {
        return meishiNumber;
    }


    /**
	 * 设置：美食数量
	 */
    public void setMeishiNumber(Integer meishiNumber) {
        this.meishiNumber = meishiNumber;
    }
    /**
	 * 获取：价格
	 */
    public Double getMeishiMoney() {
        return meishiMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setMeishiMoney(Double meishiMoney) {
        this.meishiMoney = meishiMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 获取：美食详情
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 设置：美食详情
	 */
    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
