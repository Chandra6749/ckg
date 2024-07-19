package com.example.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusDto {
    public BusDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;

    public BusDto() {

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
}
