package com.example.springmvc.domain;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springmvc.Dao.JobDao;

import com.example.springmvc.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobDao jobDao;
    @Override
    public Boolean save(date_job book) {
        return jobDao.insert(book)>0;
    }

    @Override
    public Boolean update(date_job book) {
        return jobDao.updateById(book)>0;
    }

    @Override
    public Boolean delete(Integer book) {
        return jobDao.deleteById(book)>0;

    }

    @Override
    public date_job getById(Integer id) {
        return jobDao.selectById(id);
    }

    @Override
    public List<date_job> getAll() {
        return jobDao.selectList(null);
    }

    @Override
    public IPage<date_job> page(int p, int g) {
        Page page = new Page(p,g);
        return jobDao.selectPage(page,null);
    }

    @Override
    public List<date_job> selectByMap(Map<String, Object> columnMap) {
        return jobDao.selectByMap(columnMap);
    }

}
