package com.entity.model;

import com.entity.JingdianYuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 景点预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingdianYuyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 景点
     */
    private Integer jingdianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jingdianYuyeTime;


    /**
     * 预约备注
     */
    private String jingdianYuyeText;


    /**
     * 审核结果
     */
    private Integer jingdianYuyeYesnoTypes;


    /**
     * 审核反馈
     */
    private String jingdianYuyeYesnoText;


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
	 * 获取：景点
	 */
    public Integer getJingdianId() {
        return jingdianId;
    }


    /**
	 * 设置：景点
	 */
    public void setJingdianId(Integer jingdianId) {
        this.jingdianId = jingdianId;
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
    public Date getJingdianYuyeTime() {
        return jingdianYuyeTime;
    }


    /**
	 * 设置：预约日期
	 */
    public void setJingdianYuyeTime(Date jingdianYuyeTime) {
        this.jingdianYuyeTime = jingdianYuyeTime;
    }
    /**
	 * 获取：预约备注
	 */
    public String getJingdianYuyeText() {
        return jingdianYuyeText;
    }


    /**
	 * 设置：预约备注
	 */
    public void setJingdianYuyeText(String jingdianYuyeText) {
        this.jingdianYuyeText = jingdianYuyeText;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getJingdianYuyeYesnoTypes() {
        return jingdianYuyeYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setJingdianYuyeYesnoTypes(Integer jingdianYuyeYesnoTypes) {
        this.jingdianYuyeYesnoTypes = jingdianYuyeYesnoTypes;
    }
    /**
	 * 获取：审核反馈
	 */
    public String getJingdianYuyeYesnoText() {
        return jingdianYuyeYesnoText;
    }


    /**
	 * 设置：审核反馈
	 */
    public void setJingdianYuyeYesnoText(String jingdianYuyeYesnoText) {
        this.jingdianYuyeYesnoText = jingdianYuyeYesnoText;
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
