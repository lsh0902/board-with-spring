package com.example.MYBoard.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by hehesi2007@gmail.com on 2021-11-16
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
@Getter
@Setter
public class PostDtoToController {
    private String title;
    private String body;
    private String user;
    private Long id;
    private LocalDate createDate;
}
