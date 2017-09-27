package net.chinanets.sj.mapper;

import net.chinanets.sj.bean.Flqwjbxx;
import org.apache.ibatis.annotations.Param;

public interface FlqwjbxxMapper {

    Flqwjbxx selectByPrimaryKey(@Param("id") Integer id);

}