package com.entity.model;

import com.entity.FnagjianYuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FnagjianYuyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房间
     */
    private Integer fangjianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fnagjianYuyeTime;


    /**
     * 预约备注
     */
    private String fnagjianYuyeText;


    /**
     * 近期体温
     */
    private Double fnagjianTiwen;


    /**
     * 近期行程
     */
    private String fnagjianText;


    /**
     * 审核结果
     */
    private Integer fnagjianYuyeYesnoTypes;


    /**
     * 审核反馈
     */
    private String fnagjianYuyeYesnoText;


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
	 * 获取：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }


    /**
	 * 设置：房间
	 */
    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
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
    public Date getFnagjianYuyeTime() {
        return fnagjianYuyeTime;
    }


    /**
	 * 设置：预约日期
	 */
    public void setFnagjianYuyeTime(Date fnagjianYuyeTime) {
        this.fnagjianYuyeTime = fnagjianYuyeTime;
    }
    /**
	 * 获取：预约备注
	 */
    public String getFnagjianYuyeText() {
        return fnagjianYuyeText;
    }


    /**
	 * 设置：预约备注
	 */
    public void setFnagjianYuyeText(String fnagjianYuyeText) {
        this.fnagjianYuyeText = fnagjianYuyeText;
    }
    /**
	 * 获取：近期体温
	 */
    public Double getFnagjianTiwen() {
        return fnagjianTiwen;
    }


    /**
	 * 设置：近期体温
	 */
    public void setFnagjianTiwen(Double fnagjianTiwen) {
        this.fnagjianTiwen = fnagjianTiwen;
    }
    /**
	 * 获取：近期行程
	 */
    public String getFnagjianText() {
        return fnagjianText;
    }


    /**
	 * 设置：近期行程
	 */
    public void setFnagjianText(String fnagjianText) {
        this.fnagjianText = fnagjianText;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getFnagjianYuyeYesnoTypes() {
        return fnagjianYuyeYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setFnagjianYuyeYesnoTypes(Integer fnagjianYuyeYesnoTypes) {
        this.fnagjianYuyeYesnoTypes = fnagjianYuyeYesnoTypes;
    }
    /**
	 * 获取：审核反馈
	 */
    public String getFnagjianYuyeYesnoText() {
        return fnagjianYuyeYesnoText;
    }


    /**
	 * 设置：审核反馈
	 */
    public void setFnagjianYuyeYesnoText(String fnagjianYuyeYesnoText) {
        this.fnagjianYuyeYesnoText = fnagjianYuyeYesnoText;
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
