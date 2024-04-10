package com.BiteBliss.BiteBliss_Backend.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BiteBliss.BiteBliss_Backend.POJO.Favorite;
import com.BiteBliss.BiteBliss_Backend.mapper.FavoriteMapper;
import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;

@Service
public class FavoriteServiceImpl implements FavoriteService {

  @Autowired
  private FavoriteMapper favoriteMapper; 

  public void addFavorite(String favStalls, int uid) {
    Favorite newFavorite = new Favorite();
    newFavorite.setUserId(uid);
    newFavorite.setFavoriteStall(favStalls);
    Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
    newFavorite.setUpdateTime(currentTimestamp);
    newFavorite.setIsDelete(0);
    favoriteMapper.insertFavorite(newFavorite);
  }

  public Favorite getFavoriteByUid(int uid) {
    return favoriteMapper.getFavoriteByUid(uid);
  }

  public void updateFavoriteByUid(String favStalls, int uid) {

  }

}
