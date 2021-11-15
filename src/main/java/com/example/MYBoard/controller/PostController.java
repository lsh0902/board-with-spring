package com.example.MYBoard.controller;

import com.example.MYBoard.dto.PostDto;
import com.example.MYBoard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hehesi2007@gmail.com on 2021-11-15
 * Blog : http://mvmvm.tistory.com
 * Github : http://github.com/lsh0902
 */
@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("write")
    public String writePage() {
        return "write";
    }

    @GetMapping("/posts")
    public String get(Model model) {
        model.addAttribute("postList", postService.getPost());
        return "main";
    }

    @PostMapping("/posts")
    public String create(@ModelAttribute PostDto postDto) {
        //쓰기 작업
        postService.createPost(postDto);
        return "redirect:/posts";
    }
}
