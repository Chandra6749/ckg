package com.example.payload;

import com.example.entity.Bus;
import com.example.entity.Stop;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusStopDto {
    private Long id;
    private Stop stop;
    private Bus bus;
    private Integer stopOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Integer getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(Integer stopOrder) {
        this.stopOrder = stopOrder;
    }

    public BusStopDto(Long id, Stop stop, Bus bus, Integer stopOrder) {
        this.id = id;
        this.stop = stop;
        this.bus = bus;
        this.stopOrder = stopOrder;
    }
}
