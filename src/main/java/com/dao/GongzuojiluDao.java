package com.dao;

import com.entity.GongzuojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuojiluView;

/**
 * 工作记录 Dao 接口
 *
 * @author 
 */
public interface GongzuojiluDao extends BaseMapper<GongzuojiluEntity> {

   List<GongzuojiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
