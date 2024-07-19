package com.example.service;

import com.example.entity.Post;
import com.example.payload.PostDto;
import com.example.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    
    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
public PostDto createPost(PostDto dto){
    Post post = mapToEntity(dto);
    post = postRepository.save(post);
    PostDto postDto = mapToDto(post);
    return postDto;
}

public PostDto mapToDto(Post post){
    PostDto dto = new PostDto();
    dto.setId(post.getId());
    dto.setTitle(post.getTitle());
    dto.setDescription(post.getDescription());
    return dto;
}

public Post mapToEntity(PostDto dto){
    Post post = new Post();
    post.setId(dto.getId());
    post.setTitle(dto.getTitle());
    post.setDescription(dto.getDescription());
    return post;
}
    }

