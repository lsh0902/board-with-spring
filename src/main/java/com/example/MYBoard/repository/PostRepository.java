package com.example.MYBoard.repository;

import com.example.MYBoard.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hehesi2007@gmail.com on 2021-11-15
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
public interface PostRepository extends JpaRepository<Post, Long> {

}
