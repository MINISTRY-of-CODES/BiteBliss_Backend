package com.BiteBliss.BiteBliss_Backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.BiteBliss.BiteBliss_Backend.pojo.Favorite;

@Mapper
public interface FavoriteMapper {
  
  List<Favorite> getAllFavorite();

  Favorite getFavoriteByUid(@Param("userId") String uid);

  int insertFavorite(Favorite favorite);

  int updateFavoriteByUid(Map<String, Object> map);
}
