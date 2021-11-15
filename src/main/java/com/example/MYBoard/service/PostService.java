package com.example.MYBoard.service;

import com.example.MYBoard.dto.PostDto;
import com.example.MYBoard.entity.Post;
import com.example.MYBoard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost(PostDto postDto) {
        Post post = new Post();
        post.setCreateDate(LocalDate.now());
        post.setBody(postDto.getBody());
        post.setTitle(postDto.getTitle());
        post.setUser(postDto.getUser());
        postRepository.save(post);
    }

    public List<Post> getPost() {
        return postRepository.findAll();
    }

}
