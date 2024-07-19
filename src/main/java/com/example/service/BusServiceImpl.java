package com.example.service;

import com.example.entity.Bus;
import com.example.entity.Post;
import com.example.payload.BusDto;
import com.example.payload.PostDto;
import com.example.repository.BusRepository;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    private BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }
    @Override
    public BusDto createBus(BusDto dto){
        Bus bus = mapToEntity(dto);
         bus = busRepository.save(bus);
         BusDto busDto = mapToDto(bus);
         return busDto;
    }
    public BusDto mapToDto(Bus bus) {
        BusDto dto = new BusDto();
        dto.setId(bus.getId());
        dto.setName(bus.getName());
        return dto;
    }
    public Bus mapToEntity(BusDto dto) {
        Bus bus = new Bus();
        bus.setId(dto.getId());
        bus.setName(dto.getName());
        return bus;
    }

}
