package com.entity.model;

import com.entity.GongzuojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuojiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 工作人员
     */
    private Integer gongzuorenyuanId;


    /**
     * 体温
     */
    private Double gongzuorenyuanTiwen;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 工作记录
     */
    private String gongzuorenyuanText;


    /**
     * 假删
     */
    private Integer gongzuorenyuanDelete;


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
	 * 获取：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }


    /**
	 * 设置：工作人员
	 */
    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 获取：体温
	 */
    public Double getGongzuorenyuanTiwen() {
        return gongzuorenyuanTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setGongzuorenyuanTiwen(Double gongzuorenyuanTiwen) {
        this.gongzuorenyuanTiwen = gongzuorenyuanTiwen;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：工作记录
	 */
    public String getGongzuorenyuanText() {
        return gongzuorenyuanText;
    }


    /**
	 * 设置：工作记录
	 */
    public void setGongzuorenyuanText(String gongzuorenyuanText) {
        this.gongzuorenyuanText = gongzuorenyuanText;
    }
    /**
	 * 获取：假删
	 */
    public Integer getGongzuorenyuanDelete() {
        return gongzuorenyuanDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setGongzuorenyuanDelete(Integer gongzuorenyuanDelete) {
        this.gongzuorenyuanDelete = gongzuorenyuanDelete;
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
