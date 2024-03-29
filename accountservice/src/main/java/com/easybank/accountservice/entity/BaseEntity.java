package com.easybank.accountservice.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter@Setter@ToString
public class BaseEntity {

	@Column(updatable = false)
	private LocalDateTime createdAt;
	@Column(updatable = false)
	private String createdBy;
	@Column(insertable = false)
	private LocalDateTime updatedAt;
	@Column(insertable = false)
	private String updatedBy;
}
