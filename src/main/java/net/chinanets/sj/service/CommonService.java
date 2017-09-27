package net.chinanets.sj.service;

import net.chinanets.sj.bean.Cpws;
import net.chinanets.sj.mapper.CpwsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommonService {

    @Autowired
    CpwsMapper cpwsMapper;

    public Cpws getCpwsById(Integer id) {
        return cpwsMapper.selectByPrimaryKey(id);
    }

    public Integer getCount(){
        return cpwsMapper.getCount();
    }
}