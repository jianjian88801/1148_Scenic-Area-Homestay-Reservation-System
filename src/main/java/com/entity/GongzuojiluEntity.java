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
 * 工作记录
 *
 * @author 
 * @email
 */
@TableName("gongzuojilu")
public class GongzuojiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuojiluEntity() {

	}

	public GongzuojiluEntity(T t) {
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
     * 工作人员
     */
    @TableField(value = "gongzuorenyuan_id")

    private Integer gongzuorenyuanId;


    /**
     * 体温
     */
    @TableField(value = "gongzuorenyuan_tiwen")

    private Double gongzuorenyuanTiwen;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 工作记录
     */
    @TableField(value = "gongzuorenyuan_text")

    private String gongzuorenyuanText;


    /**
     * 假删
     */
    @TableField(value = "gongzuorenyuan_delete")

    private Integer gongzuorenyuanDelete;


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
	 * 设置：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }


    /**
	 * 获取：工作人员
	 */

    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 设置：体温
	 */
    public Double getGongzuorenyuanTiwen() {
        return gongzuorenyuanTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setGongzuorenyuanTiwen(Double gongzuorenyuanTiwen) {
        this.gongzuorenyuanTiwen = gongzuorenyuanTiwen;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：工作记录
	 */
    public String getGongzuorenyuanText() {
        return gongzuorenyuanText;
    }


    /**
	 * 获取：工作记录
	 */

    public void setGongzuorenyuanText(String gongzuorenyuanText) {
        this.gongzuorenyuanText = gongzuorenyuanText;
    }
    /**
	 * 设置：假删
	 */
    public Integer getGongzuorenyuanDelete() {
        return gongzuorenyuanDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setGongzuorenyuanDelete(Integer gongzuorenyuanDelete) {
        this.gongzuorenyuanDelete = gongzuorenyuanDelete;
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
        return "Gongzuojilu{" +
            "id=" + id +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", gongzuorenyuanTiwen=" + gongzuorenyuanTiwen +
            ", insertTime=" + insertTime +
            ", gongzuorenyuanText=" + gongzuorenyuanText +
            ", gongzuorenyuanDelete=" + gongzuorenyuanDelete +
            ", createTime=" + createTime +
        "}";
    }
}
