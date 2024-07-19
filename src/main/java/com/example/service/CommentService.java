package com.example.service;

import com.example.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto dto, long postId);
}
