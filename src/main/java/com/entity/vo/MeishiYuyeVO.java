package com.entity.vo;

import com.entity.MeishiYuyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishi_yuye")
public class MeishiYuyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

}
