package com.main.project2.DAL.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "loai_thietbi")
@Getter
@Setter
@NoArgsConstructor
public class loai_thietbi {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(fetch = FetchType.LAZY,
                mappedBy = "loai_thietbi",
                cascade = CascadeType.REMOVE)
    private List<thietbi> thietbis;

}
