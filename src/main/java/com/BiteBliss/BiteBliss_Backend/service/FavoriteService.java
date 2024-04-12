package com.BiteBliss.BiteBliss_Backend.service;

import com.BiteBliss.BiteBliss_Backend.pojo.Favorite;

public interface FavoriteService {
  public void addFavorite(String favStalls, String uid);

  public Favorite getFavoriteByUid(String uid);

  public void updateFavoriteByUid(String favStalls, String uid);
}
