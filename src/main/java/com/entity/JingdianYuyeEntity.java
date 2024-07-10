package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 景点预约
 *
 * @author 
 * @email
 */
@TableName("jingdian_yuye")
public class JingdianYuyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianYuyeEntity() {

	}

	public JingdianYuyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 景点
     */
    @TableField(value = "jingdian_id")

    private Integer jingdianId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "jingdian_yuye_time")

    private Date jingdianYuyeTime;


    /**
     * 预约备注
     */
    @TableField(value = "jingdian_yuye_text")

    private String jingdianYuyeText;


    /**
     * 审核结果
     */
    @TableField(value = "jingdian_yuye_yesno_types")

    private Integer jingdianYuyeYesnoTypes;


    /**
     * 审核反馈
     */
    @TableField(value = "jingdian_yuye_yesno_text")

    private String jingdianYuyeYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：景点
	 */
    public Integer getJingdianId() {
        return jingdianId;
    }


    /**
	 * 获取：景点
	 */

    public void setJingdianId(Integer jingdianId) {
        this.jingdianId = jingdianId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约日期
	 */
    public Date getJingdianYuyeTime() {
        return jingdianYuyeTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setJingdianYuyeTime(Date jingdianYuyeTime) {
        this.jingdianYuyeTime = jingdianYuyeTime;
    }
    /**
	 * 设置：预约备注
	 */
    public String getJingdianYuyeText() {
        return jingdianYuyeText;
    }


    /**
	 * 获取：预约备注
	 */

    public void setJingdianYuyeText(String jingdianYuyeText) {
        this.jingdianYuyeText = jingdianYuyeText;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getJingdianYuyeYesnoTypes() {
        return jingdianYuyeYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setJingdianYuyeYesnoTypes(Integer jingdianYuyeYesnoTypes) {
        this.jingdianYuyeYesnoTypes = jingdianYuyeYesnoTypes;
    }
    /**
	 * 设置：审核反馈
	 */
    public String getJingdianYuyeYesnoText() {
        return jingdianYuyeYesnoText;
    }


    /**
	 * 获取：审核反馈
	 */

    public void setJingdianYuyeYesnoText(String jingdianYuyeYesnoText) {
        this.jingdianYuyeYesnoText = jingdianYuyeYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JingdianYuye{" +
            "id=" + id +
            ", jingdianId=" + jingdianId +
            ", yonghuId=" + yonghuId +
            ", jingdianYuyeTime=" + jingdianYuyeTime +
            ", jingdianYuyeText=" + jingdianYuyeText +
            ", jingdianYuyeYesnoTypes=" + jingdianYuyeYesnoTypes +
            ", jingdianYuyeYesnoText=" + jingdianYuyeYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
