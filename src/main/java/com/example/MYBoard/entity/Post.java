package com.example.MYBoard.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by hehesi2007@gmail.com on 2021-11-15
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private LocalDate createDate;
    private String user;
}
