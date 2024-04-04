package com.main.project2.DAL.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "thongtin_sudung")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class thongtin_sudung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_thanhvien")
    private thanhvien thanhvien;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_thietbi")
    private thietbi thietbi;

    @Column(name = "ngaymuon")
    private LocalDateTime ngaymuon = LocalDateTime.now();

    @Column(name = "ngaytra")
    private LocalDateTime ngaytra = null;
}
