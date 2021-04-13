package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TopUserRole implements Serializable {
    private Long id;

    private Long topUserId;

    private Long topRoleId;

    private Long topSourceId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}