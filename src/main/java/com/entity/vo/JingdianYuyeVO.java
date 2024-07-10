package com.entity.vo;

import com.entity.JingdianYuyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 景点预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingdian_yuye")
public class JingdianYuyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

}
