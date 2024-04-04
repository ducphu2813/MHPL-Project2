package com.main.project2.DAL.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "thongtin_vao")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class thongtin_vao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_thanhvien")
    private thanhvien thanhvien;

    @Column(name = "thoigian_vao")
    private LocalDateTime thoigian_vao = LocalDateTime.now();

}
