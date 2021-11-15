package com.example.MYBoard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by hehesi2007@gmail.com on 2021-11-15
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private String title;
    private String body;
    private String user;
}
