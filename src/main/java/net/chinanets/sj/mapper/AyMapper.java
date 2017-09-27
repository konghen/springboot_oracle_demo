package net.chinanets.sj.mapper;

import net.chinanets.sj.bean.Ay;
import org.apache.ibatis.annotations.Param;

public interface AyMapper {

    Ay selectByPrimaryKey(@Param("id") Integer id);

}