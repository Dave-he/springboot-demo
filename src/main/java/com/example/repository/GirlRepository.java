package com.example.repository;

import com.example.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by liyubo on 2017/4/1.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>,JpaSpecificationExecutor<Integer>{

    //通过年龄查询
    public List<Girl> findByAge(Integer id);

}

