package com.BiteBliss.BiteBliss_Backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.BiteBliss.BiteBliss_Backend.POJO.Favorite;

@Mapper
public interface FavoriteMapper {
  
  /**
   * 根据用户ID获取对应的收藏对象。
   * 
   * @param id 用户的唯一标识符。
   * @return 返回对应的Favorite对象，如果没有找到则返回null。
   */
  List<Favorite> getAllFavorite();

  Favorite getFavoriteByUid(@Param("uid") int uid);

  int insertFavorite(Favorite favorite);
}
