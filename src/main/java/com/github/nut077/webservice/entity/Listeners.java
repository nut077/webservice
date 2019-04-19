package com.github.nut077.webservice.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.OffsetDateTime;

public class Listeners<T extends Common> {

    @PrePersist
    private void prePersist(T e) {
        e.setCreatedDate(OffsetDateTime.now());
    }

    @PreUpdate
    private void preUpdate(T e) {
        e.setUpdatedDate(OffsetDateTime.now());
    }
}
