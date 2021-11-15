package com.example.MYBoard.service;

import com.example.MYBoard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by hehesi2007@gmail.com on 2021-11-15
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost() {

    }

}
