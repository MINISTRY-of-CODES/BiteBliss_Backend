package com.BiteBliss.BiteBliss_Backend.test;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import com.BiteBliss.BiteBliss_Backend.POJO.Favorite;
import com.BiteBliss.BiteBliss_Backend.mapper.FavoriteMapper;
import com.BiteBliss.BiteBliss_Backend.utils.MybatisUtil;


public class mapperTest {
  @Test
  public void favoriteMapperTest() {

    FavoriteMapper mapper = MybatisUtil.getSqlSession().getMapper(FavoriteMapper.class);
    Favorite newFavorite = new Favorite();
    newFavorite.setUserId(4);
    newFavorite.setFavoriteStall("{\"favorite\": [\"1\", \"2\", \"3\"]}");
    Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
    newFavorite.setUpdateTime(currentTimestamp);
    newFavorite.setIsDelete(0);
    mapper.insertFavorite(newFavorite);

  }
}
