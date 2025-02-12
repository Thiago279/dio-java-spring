package br.com.dio.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BlockEntity {

    public Long id;
    public OffsetDateTime blockedAt;
    public String blockReason;
    public OffsetDateTime unblockedAt;
    public String unblockReason;
}
