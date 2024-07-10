package com.entity.view;

import com.entity.JingdianYuyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 景点预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jingdian_yuye")
public class JingdianYuyeView extends JingdianYuyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核结果的值
		*/
		private String jingdianYuyeYesnoValue;



		//级联表 jingdian
			/**
			* 景点名称
			*/
			private String jingdianName;
			/**
			* 景点图片
			*/
			private String jingdianPhoto;
			/**
			* 景点类型
			*/
			private Integer jingdianTypes;
				/**
				* 景点类型的值
				*/
				private String jingdianValue;
			/**
			* 景点价格
			*/
			private Double jingdianMoney;
			/**
			* 景点数量
			*/
			private Integer jingdianNumber;
			/**
			* 点击次数
			*/
			private Integer jingdianClicknum;
			/**
			* 景点详情
			*/
			private String jingdianContent;

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

	public JingdianYuyeView() {

	}

	public JingdianYuyeView(JingdianYuyeEntity jingdianYuyeEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianYuyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核结果的值
			*/
			public String getJingdianYuyeYesnoValue() {
				return jingdianYuyeYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setJingdianYuyeYesnoValue(String jingdianYuyeYesnoValue) {
				this.jingdianYuyeYesnoValue = jingdianYuyeYesnoValue;
			}






















				//级联表的get和set jingdian
					/**
					* 获取： 景点名称
					*/
					public String getJingdianName() {
						return jingdianName;
					}
					/**
					* 设置： 景点名称
					*/
					public void setJingdianName(String jingdianName) {
						this.jingdianName = jingdianName;
					}
					/**
					* 获取： 景点图片
					*/
					public String getJingdianPhoto() {
						return jingdianPhoto;
					}
					/**
					* 设置： 景点图片
					*/
					public void setJingdianPhoto(String jingdianPhoto) {
						this.jingdianPhoto = jingdianPhoto;
					}
					/**
					* 获取： 景点类型
					*/
					public Integer getJingdianTypes() {
						return jingdianTypes;
					}
					/**
					* 设置： 景点类型
					*/
					public void setJingdianTypes(Integer jingdianTypes) {
						this.jingdianTypes = jingdianTypes;
					}


						/**
						* 获取： 景点类型的值
						*/
						public String getJingdianValue() {
							return jingdianValue;
						}
						/**
						* 设置： 景点类型的值
						*/
						public void setJingdianValue(String jingdianValue) {
							this.jingdianValue = jingdianValue;
						}
					/**
					* 获取： 景点价格
					*/
					public Double getJingdianMoney() {
						return jingdianMoney;
					}
					/**
					* 设置： 景点价格
					*/
					public void setJingdianMoney(Double jingdianMoney) {
						this.jingdianMoney = jingdianMoney;
					}
					/**
					* 获取： 景点数量
					*/
					public Integer getJingdianNumber() {
						return jingdianNumber;
					}
					/**
					* 设置： 景点数量
					*/
					public void setJingdianNumber(Integer jingdianNumber) {
						this.jingdianNumber = jingdianNumber;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getJingdianClicknum() {
						return jingdianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setJingdianClicknum(Integer jingdianClicknum) {
						this.jingdianClicknum = jingdianClicknum;
					}
					/**
					* 获取： 景点详情
					*/
					public String getJingdianContent() {
						return jingdianContent;
					}
					/**
					* 设置： 景点详情
					*/
					public void setJingdianContent(String jingdianContent) {
						this.jingdianContent = jingdianContent;
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
