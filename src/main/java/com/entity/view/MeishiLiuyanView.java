package com.entity.view;

import com.entity.MeishiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 美食反馈
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishi_liuyan")
public class MeishiLiuyanView extends MeishiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 meishi
			/**
			* 美食名称
			*/
			private String meishiName;
			/**
			* 美食图片
			*/
			private String meishiPhoto;
			/**
			* 美食类型
			*/
			private Integer meishiTypes;
				/**
				* 美食类型的值
				*/
				private String meishiValue;
			/**
			* 美食数量
			*/
			private Integer meishiNumber;
			/**
			* 价格
			*/
			private Double meishiMoney;
			/**
			* 点击次数
			*/
			private Integer meishiClicknum;
			/**
			* 美食详情
			*/
			private String meishiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public MeishiLiuyanView() {

	}

	public MeishiLiuyanView(MeishiLiuyanEntity meishiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, meishiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


































				//级联表的get和set meishi
					/**
					* 获取： 美食名称
					*/
					public String getMeishiName() {
						return meishiName;
					}
					/**
					* 设置： 美食名称
					*/
					public void setMeishiName(String meishiName) {
						this.meishiName = meishiName;
					}
					/**
					* 获取： 美食图片
					*/
					public String getMeishiPhoto() {
						return meishiPhoto;
					}
					/**
					* 设置： 美食图片
					*/
					public void setMeishiPhoto(String meishiPhoto) {
						this.meishiPhoto = meishiPhoto;
					}
					/**
					* 获取： 美食类型
					*/
					public Integer getMeishiTypes() {
						return meishiTypes;
					}
					/**
					* 设置： 美食类型
					*/
					public void setMeishiTypes(Integer meishiTypes) {
						this.meishiTypes = meishiTypes;
					}


						/**
						* 获取： 美食类型的值
						*/
						public String getMeishiValue() {
							return meishiValue;
						}
						/**
						* 设置： 美食类型的值
						*/
						public void setMeishiValue(String meishiValue) {
							this.meishiValue = meishiValue;
						}
					/**
					* 获取： 美食数量
					*/
					public Integer getMeishiNumber() {
						return meishiNumber;
					}
					/**
					* 设置： 美食数量
					*/
					public void setMeishiNumber(Integer meishiNumber) {
						this.meishiNumber = meishiNumber;
					}
					/**
					* 获取： 价格
					*/
					public Double getMeishiMoney() {
						return meishiMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setMeishiMoney(Double meishiMoney) {
						this.meishiMoney = meishiMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getMeishiClicknum() {
						return meishiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setMeishiClicknum(Integer meishiClicknum) {
						this.meishiClicknum = meishiClicknum;
					}
					/**
					* 获取： 美食详情
					*/
					public String getMeishiContent() {
						return meishiContent;
					}
					/**
					* 设置： 美食详情
					*/
					public void setMeishiContent(String meishiContent) {
						this.meishiContent = meishiContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
