package com.main.project2.DAL.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "thanhvien_sequence")
@Getter
@Setter
@NoArgsConstructor
public class thanhvien_sequence {

    @Id
    @Column(name = "name")
    String name;

    @Column(name = "num")
    Long num;

}
