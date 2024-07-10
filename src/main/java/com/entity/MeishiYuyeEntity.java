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
 * 美食预约
 *
 * @author 
 * @email
 */
@TableName("meishi_yuye")
public class MeishiYuyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeishiYuyeEntity() {

	}

	public MeishiYuyeEntity(T t) {
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
     * 美食
     */
    @TableField(value = "meishi_id")

    private Integer meishiId;


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
    @TableField(value = "meishi_yuye_time")

    private Date meishiYuyeTime;


    /**
     * 预约备注
     */
    @TableField(value = "meishi_yuye_text")

    private String meishiYuyeText;


    /**
     * 审核结果
     */
    @TableField(value = "meishi_yuye_yesno_types")

    private Integer meishiYuyeYesnoTypes;


    /**
     * 审核反馈
     */
    @TableField(value = "meishi_yuye_yesno_text")

    private String meishiYuyeYesnoText;


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
	 * 设置：美食
	 */
    public Integer getMeishiId() {
        return meishiId;
    }


    /**
	 * 获取：美食
	 */

    public void setMeishiId(Integer meishiId) {
        this.meishiId = meishiId;
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
    public Date getMeishiYuyeTime() {
        return meishiYuyeTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setMeishiYuyeTime(Date meishiYuyeTime) {
        this.meishiYuyeTime = meishiYuyeTime;
    }
    /**
	 * 设置：预约备注
	 */
    public String getMeishiYuyeText() {
        return meishiYuyeText;
    }


    /**
	 * 获取：预约备注
	 */

    public void setMeishiYuyeText(String meishiYuyeText) {
        this.meishiYuyeText = meishiYuyeText;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getMeishiYuyeYesnoTypes() {
        return meishiYuyeYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setMeishiYuyeYesnoTypes(Integer meishiYuyeYesnoTypes) {
        this.meishiYuyeYesnoTypes = meishiYuyeYesnoTypes;
    }
    /**
	 * 设置：审核反馈
	 */
    public String getMeishiYuyeYesnoText() {
        return meishiYuyeYesnoText;
    }


    /**
	 * 获取：审核反馈
	 */

    public void setMeishiYuyeYesnoText(String meishiYuyeYesnoText) {
        this.meishiYuyeYesnoText = meishiYuyeYesnoText;
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
        return "MeishiYuye{" +
            "id=" + id +
            ", meishiId=" + meishiId +
            ", yonghuId=" + yonghuId +
            ", meishiYuyeTime=" + meishiYuyeTime +
            ", meishiYuyeText=" + meishiYuyeText +
            ", meishiYuyeYesnoTypes=" + meishiYuyeYesnoTypes +
            ", meishiYuyeYesnoText=" + meishiYuyeYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
