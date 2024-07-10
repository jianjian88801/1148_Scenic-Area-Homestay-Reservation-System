package com.dao;

import com.entity.MeishiYuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiYuyeView;

/**
 * 美食预约 Dao 接口
 *
 * @author 
 */
public interface MeishiYuyeDao extends BaseMapper<MeishiYuyeEntity> {

   List<MeishiYuyeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
