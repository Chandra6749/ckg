package com.example.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StopDto {
    private Long id;
    private String name;

    public StopDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StopDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setStopName(String stopName) {
    }

    public StopDto(String name) {
        this.name = name;
    }

    public String getStopName() {
      return name;
    }
}
