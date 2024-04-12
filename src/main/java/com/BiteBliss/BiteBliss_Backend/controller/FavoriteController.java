package com.BiteBliss.BiteBliss_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BiteBliss.BiteBliss_Backend.pojo.Favorite;
import com.BiteBliss.BiteBliss_Backend.pojo.Result;
import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("/add")
    public Result addFavorite(@RequestBody String favStalls, @RequestHeader("uid") String uid) {
        // 查找数据表中是否已存在该用户的记录
        Favorite favorite = new Favorite();
        favorite = favoriteService.getFavoriteByUid(uid);
        if (favorite == null) {
            // 如果不存在，则插入新记录
            favoriteService.addFavorite(favStalls, uid);
        } else {
            // 如果存在，则更新记录
            favoriteService.updateFavoriteByUid(favStalls, uid);
        }

        return Result.success();
    }

}
