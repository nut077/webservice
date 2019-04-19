package com.github.nut077.webservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.OffsetDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(value = Listeners.class)
public abstract class Common {

    private OffsetDateTime createdDate;
    private OffsetDateTime updatedDate;

    @Version
    private int version;
}
