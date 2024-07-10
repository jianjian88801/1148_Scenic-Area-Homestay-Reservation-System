package com.entity.model;

import com.entity.MeishiYuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishiYuyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 美食
     */
    private Integer meishiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date meishiYuyeTime;


    /**
     * 预约备注
     */
    private String meishiYuyeText;


    /**
     * 审核结果
     */
    private Integer meishiYuyeYesnoTypes;


    /**
     * 审核反馈
     */
    private String meishiYuyeYesnoText;


    /**
     * 创建时间
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
	 * 获取：美食
	 */
    public Integer getMeishiId() {
        return meishiId;
    }


    /**
	 * 设置：美食
	 */
    public void setMeishiId(Integer meishiId) {
        this.meishiId = meishiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约日期
	 */
    public Date getMeishiYuyeTime() {
        return meishiYuyeTime;
    }


    /**
	 * 设置：预约日期
	 */
    public void setMeishiYuyeTime(Date meishiYuyeTime) {
        this.meishiYuyeTime = meishiYuyeTime;
    }
    /**
	 * 获取：预约备注
	 */
    public String getMeishiYuyeText() {
        return meishiYuyeText;
    }


    /**
	 * 设置：预约备注
	 */
    public void setMeishiYuyeText(String meishiYuyeText) {
        this.meishiYuyeText = meishiYuyeText;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getMeishiYuyeYesnoTypes() {
        return meishiYuyeYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setMeishiYuyeYesnoTypes(Integer meishiYuyeYesnoTypes) {
        this.meishiYuyeYesnoTypes = meishiYuyeYesnoTypes;
    }
    /**
	 * 获取：审核反馈
	 */
    public String getMeishiYuyeYesnoText() {
        return meishiYuyeYesnoText;
    }


    /**
	 * 设置：审核反馈
	 */
    public void setMeishiYuyeYesnoText(String meishiYuyeYesnoText) {
        this.meishiYuyeYesnoText = meishiYuyeYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
