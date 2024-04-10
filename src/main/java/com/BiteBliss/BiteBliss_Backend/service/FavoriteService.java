package com.BiteBliss.BiteBliss_Backend.service;

import com.BiteBliss.BiteBliss_Backend.POJO.Favorite;

public interface FavoriteService {
  public void addFavorite(String favStalls, int uid);

  public Favorite getFavoriteByUid(int uid);

  public void updateFavoriteByUid(String favStalls, int uid);
}
