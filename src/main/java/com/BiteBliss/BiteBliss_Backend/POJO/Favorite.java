package com.BiteBliss.BiteBliss_Backend.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
  private int id;
  private int user_id;
  private String favorite;
  private int isDelete;
}
