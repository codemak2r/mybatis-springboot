package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TopRole implements Serializable {
    private Long id;

    private String name;

    private String description;

    private String type;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}