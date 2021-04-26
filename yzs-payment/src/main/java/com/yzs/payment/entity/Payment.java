package com.yzs.payment.entity;

import java.io.Serializable;

public class Payment implements Serializable {
    Long id;
    String serialId;

    public Payment(Long id, String serialId) {
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
