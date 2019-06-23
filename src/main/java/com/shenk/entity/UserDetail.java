package com.shenk.entity;

import com.shenk.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user_detail")
@Getter
@Setter
public class UserDetail extends BaseEntity {

    @Id
    private String id;

    @Column(name = "sex")
    private String sex;

    @Column(name = "email")
    private String email;

    @Column(name = "img")
    private byte[] img;

    @Column(name = "comment")
    private String comment;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}