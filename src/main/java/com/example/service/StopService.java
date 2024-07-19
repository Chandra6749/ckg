package com.example.service;

import com.example.payload.PostDto;
import com.example.payload.StopDto;

public interface StopService {
    PostDto createPost(PostDto dto);

    StopDto createPost(StopDto dto);

    StopDto createStop(StopDto dto);
}
