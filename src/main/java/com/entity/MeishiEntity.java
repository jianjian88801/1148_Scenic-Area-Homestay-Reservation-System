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
 * 美食信息
 *
 * @author 
 * @email
 */
@TableName("meishi")
public class MeishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeishiEntity() {

	}

	public MeishiEntity(T t) {
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
        return "Meishi{" +
            "id=" + id +
            ", meishiName=" + meishiName +
            ", meishiPhoto=" + meishiPhoto +
            ", meishiTypes=" + meishiTypes +
            ", meishiNumber=" + meishiNumber +
            ", meishiMoney=" + meishiMoney +
            ", meishiClicknum=" + meishiClicknum +
            ", meishiContent=" + meishiContent +
            ", createTime=" + createTime +
        "}";
    }
}
