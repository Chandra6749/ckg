package com.example.service;

import com.example.entity.Stop;
import com.example.payload.PostDto;
import com.example.payload.StopDto;
import com.example.repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class StopServiceImpl implements StopService {
    private StopRepository stopRepository;

    public StopServiceImpl(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @Override
    public PostDto createPost(PostDto dto) {
        return null;
    }

    @Override
    public StopDto createPost(StopDto dto) {
        return null;
    }

    @Override
    public StopDto createStop(StopDto dto) {
        Stop stop = mapToEntity(dto);
        stop = stopRepository.save(stop);
        StopDto stopDto = mapToDto(stop);
        return stopDto;
    }

    public StopDto mapToDto(Stop stop) {
        StopDto dto = new StopDto();
        dto.setId(stop.getId());
        dto.setStopName(stop.getStopName());
        return dto;
    }

    public Stop mapToEntity(StopDto dto) {
        Stop stop = new Stop();
        stop.setId(dto.getId());
        stop.setStopName(dto.getStopName());
        return stop;
    }
}

