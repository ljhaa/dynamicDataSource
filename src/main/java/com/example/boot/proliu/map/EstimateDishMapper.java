package com.example.boot.proliu.map;




import com.example.boot.proliu.entity.EstimateDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author liujunhan
 * @since 2019-04-10
 */
@Mapper
public interface EstimateDishMapper {



   List<EstimateDish> fundAll();



}