package com.example.springmvc;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springmvc.Dao.JobDao;
import com.example.springmvc.domain.date_job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringMvcApplicationTests {
    date_job job =new date_job();
    @Autowired
    private JobDao jobDao;

    @Test
    void add(){

        job.setName("好书");
        job.setAddress("这是增加的");
        job.setWage("1");
        job.setCompany("saasf");
        jobDao.insert(job);
    }
    @Test
    void update(){
        job.setId(25001);
        job.setName("生日");
        job.setAddress("好书");
        job.setWage("gsag");
        job.setCompany("这是增加的内容");
        jobDao.updateById(job);
    }
    @Test
    void select(){

        jobDao.selectList(null);
    }
    @Test
    void delete(){
        jobDao.deleteById(25001);
    }
    @Test
    void page(){
        Page page = new Page(1,50);
        jobDao.selectPage(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
    }

    @Test
    void Like(){
        String name ="高级";
        String address = "杭州";
        Page page = new Page(1,50);
        LambdaQueryWrapper<date_job> queryWrapper = new LambdaQueryWrapper();
//        queryWrapper.like(name!=null, date_job::getName,name);
        queryWrapper.like(address!=null, date_job::getAddress,address);
        jobDao.selectPage(page,queryWrapper);

    }
    @Test
    void  MapSelect(){
        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("id",1);
        map.put("name","java");
        jobDao.selectByMap(map);


    }
}
