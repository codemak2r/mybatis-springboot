package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TopUser implements Serializable {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String password;

    private String status;

    private String language;

    private String lastWorkspaceId;

    private String lastOrganizationId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}