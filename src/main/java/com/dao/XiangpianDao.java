package com.dao;

import com.entity.XiangpianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangpianView;

/**
 * 相片信息 Dao 接口
 *
 * @author 
 * @since 2021-03-31
 */
public interface XiangpianDao extends BaseMapper<XiangpianEntity> {

   List<XiangpianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
