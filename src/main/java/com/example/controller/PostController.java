package com.example.controller;

import com.example.entity.Comment;
import com.example.entity.Post;
import com.example.repository.CommentRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")

public class PostController {

    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/create")
    public ResponseEntity<Post> createPosts(@RequestBody Post post) {
      Post savedPost =  postRepository.save(post);

        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }
    @DeleteMapping("/postId")
    public ResponseEntity<Post> deletePostById(@RequestParam long postId) {

        List<Comment> all = commentRepository.findAll();
        for(Comment comment : all)
        {
            if(comment.getId() == postId)
            {
                commentRepository.deleteById(comment.getId());
            }
        }
        postRepository.deleteById(postId);

    return new ResponseEntity<>(HttpStatus.OK);
   }
}
