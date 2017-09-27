package net.chinanets.sj.mapper;

import net.chinanets.sj.bean.Flqwnr;
import org.apache.ibatis.annotations.Param;

public interface FlqwnrMapper {

    Flqwnr selectByPrimaryKey(@Param("id") Integer id);

}