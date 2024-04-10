package com.BiteBliss.BiteBliss_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;

@RestController
public class FavoriteController {
  @Autowired
  private FavoriteService favoriteService;

  public void addFavorite(String favorite, int userId) {
    favoriteService.addFavorite(favorite, userId);
  }
}
