package com.example.service;

import com.example.entity.Girl;
import com.example.repository.GirlRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liyubo on 2017/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private  GirlService girlService;

    @Test
    public void findOne(){
        Girl girl = girlService.findOne(3);
        Assert.assertEquals(new Integer("7"),girl.getAge());
    }

}
