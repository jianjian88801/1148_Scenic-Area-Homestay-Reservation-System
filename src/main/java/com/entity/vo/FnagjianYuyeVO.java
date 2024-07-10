package com.entity.vo;

import com.entity.FnagjianYuyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房间预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fnagjian_yuye")
public class FnagjianYuyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 房间
     */

    @TableField(value = "fangjian_id")
    private Integer fangjianId;


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

    @TableField(value = "fnagjian_yuye_time")
    private Date fnagjianYuyeTime;


    /**
     * 预约备注
     */

    @TableField(value = "fnagjian_yuye_text")
    private String fnagjianYuyeText;


    /**
     * 近期体温
     */

    @TableField(value = "fnagjian_tiwen")
    private Double fnagjianTiwen;


    /**
     * 近期行程
     */

    @TableField(value = "fnagjian_text")
    private String fnagjianText;


    /**
     * 审核结果
     */

    @TableField(value = "fnagjian_yuye_yesno_types")
    private Integer fnagjianYuyeYesnoTypes;


    /**
     * 审核反馈
     */

    @TableField(value = "fnagjian_yuye_yesno_text")
    private String fnagjianYuyeYesnoText;


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
	 * 设置：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }


    /**
	 * 获取：房间
	 */

    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
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
    public Date getFnagjianYuyeTime() {
        return fnagjianYuyeTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setFnagjianYuyeTime(Date fnagjianYuyeTime) {
        this.fnagjianYuyeTime = fnagjianYuyeTime;
    }
    /**
	 * 设置：预约备注
	 */
    public String getFnagjianYuyeText() {
        return fnagjianYuyeText;
    }


    /**
	 * 获取：预约备注
	 */

    public void setFnagjianYuyeText(String fnagjianYuyeText) {
        this.fnagjianYuyeText = fnagjianYuyeText;
    }
    /**
	 * 设置：近期体温
	 */
    public Double getFnagjianTiwen() {
        return fnagjianTiwen;
    }


    /**
	 * 获取：近期体温
	 */

    public void setFnagjianTiwen(Double fnagjianTiwen) {
        this.fnagjianTiwen = fnagjianTiwen;
    }
    /**
	 * 设置：近期行程
	 */
    public String getFnagjianText() {
        return fnagjianText;
    }


    /**
	 * 获取：近期行程
	 */

    public void setFnagjianText(String fnagjianText) {
        this.fnagjianText = fnagjianText;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getFnagjianYuyeYesnoTypes() {
        return fnagjianYuyeYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setFnagjianYuyeYesnoTypes(Integer fnagjianYuyeYesnoTypes) {
        this.fnagjianYuyeYesnoTypes = fnagjianYuyeYesnoTypes;
    }
    /**
	 * 设置：审核反馈
	 */
    public String getFnagjianYuyeYesnoText() {
        return fnagjianYuyeYesnoText;
    }


    /**
	 * 获取：审核反馈
	 */

    public void setFnagjianYuyeYesnoText(String fnagjianYuyeYesnoText) {
        this.fnagjianYuyeYesnoText = fnagjianYuyeYesnoText;
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
