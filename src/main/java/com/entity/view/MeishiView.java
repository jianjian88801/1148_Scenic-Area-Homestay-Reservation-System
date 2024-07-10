package com.entity.view;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 美食信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishi")
public class MeishiView extends MeishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 美食类型的值
		*/
		private String meishiValue;



	public MeishiView() {

	}

	public MeishiView(MeishiEntity meishiEntity) {
		try {
			BeanUtils.copyProperties(this, meishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















}
