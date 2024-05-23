package com.indeed.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;


import java.util.Date;

@Entity
@Data
public class PostModal {



    @NotNull
    @NotEmpty
    @Id
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String technology[];

    @NotNull
    private String salary;

    @CreatedDate
    private Date createdAt;
}