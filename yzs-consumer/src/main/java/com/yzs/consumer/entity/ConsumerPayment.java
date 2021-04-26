package com.yzs.consumer.entity;

import java.io.Serializable;

public class ConsumerPayment implements Serializable {
    Long id;
    String serialId;

    public ConsumerPayment(Long id, String serialId) {
        this.id = id;
        this.serialId = serialId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }
}
