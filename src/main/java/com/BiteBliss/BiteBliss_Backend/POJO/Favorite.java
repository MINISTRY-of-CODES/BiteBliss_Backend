package com.BiteBliss.BiteBliss_Backend.POJO;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
  private int id;
  private int userId;
  private String favoriteStall;
  private Timestamp updateTime;
  private int isDelete;
}
