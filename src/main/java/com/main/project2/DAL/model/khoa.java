package com.main.project2.DAL.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "khoa")
@Getter
@Setter
@NoArgsConstructor
public class khoa {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(
            mappedBy = "khoa",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private Set<thanhvien> thanhviens;

    @Override
    public String toString() {
        return "khoa{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                '}';
    }
}
