package com.entity.vo;

import com.entity.GongzuojiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuojilu")
public class GongzuojiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
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

}
