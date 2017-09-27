package net.chinanets.sj.mapper;

import net.chinanets.sj.bean.Cpws;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface CpwsMapper {

    Cpws selectByPrimaryKey(@Param("id") Integer id);

    Integer getCount();

}