package org.magicbyte.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue()
    @Column(name = "id", length = 64)
    private Long id;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private String updateBy;
    private String createBy;

}

