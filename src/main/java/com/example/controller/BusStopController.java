package com.example.controller;

import com.example.entity.Bus;
import com.example.entity.BusStops;
import com.example.entity.Stop;
import com.example.repository.BusRepository;
import com.example.repository.BusStopsRepository;
import com.example.repository.StopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus")
public class BusStopController {

    private BusRepository busRepository;
    private StopRepository stopRepository;
    private BusStopsRepository busStopRepository;

    public BusStopController(BusRepository busRepository, StopRepository stopRepository, BusStopsRepository busStopRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.busStopRepository = busStopRepository;
    }

    @PostMapping
    public ResponseEntity<BusStops> allocateBusRoute(
            @RequestParam long busId,
            @RequestParam long stopId,
            @RequestBody BusStops busStop
    ){
        Bus bus = busRepository.findById(busId).get();
        Stop stop = stopRepository.findById(stopId).get();

        busStop.setBus(bus);
        busStop.setStop(stop);
        BusStops savedEntity = busStopRepository.save(busStop);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);

    }
}
