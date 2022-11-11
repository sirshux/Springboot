package com.example.springmvc.text;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springmvc.Service.JobService;
import com.example.springmvc.domain.date_job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;


@SpringBootTest
public class text {
date_job job = new date_job();
    @Autowired
    private JobService jobService;

    @Test
    void save(){
        System.out.println(jobService.getById(2547));
    }

    @Test
    void add(){

        job.setName("好书");
        job.setAddress("这是增加的");
        job.setWage("1");
        jobService.save(job);
    }
    @Test
    void update(){
        job.setId(2);
        job.setName("生日");
        job.setAddress("这是更改的内容");
        job.setCompany("2");
        jobService.update(job);
    }
    @Test
    void select(){
        System.out.println(jobService.getAll());
    }
    @Test
    void delete(){
        jobService.delete(16);
    }
    @Test
    void page(){
//        Page page = new Page(1,50);
        final IPage<date_job> page = jobService.page(1, 50);
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());

    }

        @Test
        void  mapSelect(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","高级开发");
//        map.put("address","上海");
        jobService.selectByMap(map);
    }
}
