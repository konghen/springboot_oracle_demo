package net.chinanets.sj.mapper;

import net.chinanets.sj.bean.Flfl;
import org.apache.ibatis.annotations.Param;

public interface FlflMapper {

    Flfl selectByPrimaryKey(@Param("id") Integer id);

}