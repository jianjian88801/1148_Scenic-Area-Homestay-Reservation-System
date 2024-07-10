package com.entity.view;

import com.entity.GongzuojiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 工作记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuojilu")
public class GongzuojiluView extends GongzuojiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gongzuorenyuan
			/**
			* 工号
			*/
			private String gongzuorenyuanUuidNumber;
			/**
			* 工作人员姓名
			*/
			private String gongzuorenyuanName;
			/**
			* 头像
			*/
			private String gongzuorenyuanPhoto;
			/**
			* 联系方式
			*/
			private String gongzuorenyuanPhone;
			/**
			* 邮箱
			*/
			private String gongzuorenyuanEmail;
			/**
			* 假删
			*/
			private Integer gongzuorenyuanDelete;

	public GongzuojiluView() {

	}

	public GongzuojiluView(GongzuojiluEntity gongzuojiluEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set gongzuorenyuan
					/**
					* 获取： 工号
					*/
					public String getGongzuorenyuanUuidNumber() {
						return gongzuorenyuanUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setGongzuorenyuanUuidNumber(String gongzuorenyuanUuidNumber) {
						this.gongzuorenyuanUuidNumber = gongzuorenyuanUuidNumber;
					}
					/**
					* 获取： 工作人员姓名
					*/
					public String getGongzuorenyuanName() {
						return gongzuorenyuanName;
					}
					/**
					* 设置： 工作人员姓名
					*/
					public void setGongzuorenyuanName(String gongzuorenyuanName) {
						this.gongzuorenyuanName = gongzuorenyuanName;
					}
					/**
					* 获取： 头像
					*/
					public String getGongzuorenyuanPhoto() {
						return gongzuorenyuanPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
						this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getGongzuorenyuanPhone() {
						return gongzuorenyuanPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
						this.gongzuorenyuanPhone = gongzuorenyuanPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getGongzuorenyuanEmail() {
						return gongzuorenyuanEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
						this.gongzuorenyuanEmail = gongzuorenyuanEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getGongzuorenyuanDelete() {
						return gongzuorenyuanDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setGongzuorenyuanDelete(Integer gongzuorenyuanDelete) {
						this.gongzuorenyuanDelete = gongzuorenyuanDelete;
					}


















}
