package com.main.project2.DAL.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "nganh")
@Getter
@Setter
@NoArgsConstructor
public class nganh {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(
            mappedBy = "nganh",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private Set<thanhvien> thanhviens;

    @Override
    public String toString() {
        return "nganh{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                '}';
    }
}
