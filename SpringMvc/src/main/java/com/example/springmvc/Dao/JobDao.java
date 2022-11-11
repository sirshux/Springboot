package com.example.springmvc.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springmvc.domain.date_job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobDao extends BaseMapper<date_job> {

}
