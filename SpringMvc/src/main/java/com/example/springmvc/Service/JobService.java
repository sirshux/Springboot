package com.example.springmvc.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springmvc.domain.date_job;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service
public interface JobService {
    Boolean save(date_job book);
    Boolean update(date_job book);
    Boolean delete(Integer book);
    date_job getById(Integer name);
    List<date_job> getAll();
    IPage<date_job> page(int p, int g);
    List<date_job> selectByMap(Map<String, Object> columnMap);


}
