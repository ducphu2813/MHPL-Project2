package com.main.project2.DAL.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "thietbi")
@Getter
@Setter
@NoArgsConstructor
public class thietbi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mota")
    private String mota;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_loai")
    private loai_thietbi loai_thietbi;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "thietbi",
            cascade = CascadeType.REMOVE)
    private Set<thongtin_sudung> thongtinsudungSet;


    @Override
    public String toString() {
        return "thietbi{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", mota='" + mota + '\'' +
                '}';
    }
}
