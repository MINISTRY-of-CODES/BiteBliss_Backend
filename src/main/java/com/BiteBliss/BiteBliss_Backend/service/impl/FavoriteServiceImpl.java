package com.BiteBliss.BiteBliss_Backend.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.BiteBliss.BiteBliss_Backend.mapper.FavoriteMapper;
import com.BiteBliss.BiteBliss_Backend.pojo.Favorite;
import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;
import com.BiteBliss.BiteBliss_Backend.utils.MybatisUtil;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class FavoriteServiceImpl implements FavoriteService {

  private FavoriteMapper favoriteMapper;

  @Override
  public void addFavorite(String favStalls, String uid) {
    try (SqlSession sqlSession = MybatisUtil.sqlSessionFactory.openSession(true)) {
      favoriteMapper = sqlSession.getMapper(FavoriteMapper.class);
      Favorite newFavorite = new Favorite();
      newFavorite.setUserId(uid);
      newFavorite.setFavoriteStall(favStalls);
      Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
      newFavorite.setUpdateTime(currentTimestamp);
      newFavorite.setIsDelete(0);
      favoriteMapper.insertFavorite(newFavorite);
      log.info("Insert favorite_stall", newFavorite);
    }
  }

  @Override
  public Favorite getFavoriteByUid(String uid) {
    try (SqlSession sqlSession = MybatisUtil.sqlSessionFactory.openSession(true)) {
      favoriteMapper = sqlSession.getMapper(FavoriteMapper.class);
      return favoriteMapper.getFavoriteByUid(uid);
    }
  }

  @Override
  public void updateFavoriteByUid(String favStalls, String uid) {
    try (SqlSession sqlSession = MybatisUtil.sqlSessionFactory.openSession(true)) {
      favoriteMapper = sqlSession.getMapper(FavoriteMapper.class);
      Map<String, Object> updateData = new HashMap<>();
      Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
      updateData.put("updateTime", currentTimestamp);
      updateData.put("favoriteStall", favStalls);
      updateData.put("userId", uid);
      favoriteMapper.updateFavoriteByUid(updateData);
      log.info("Update favorite_stall", updateData);
    }
  }
}
