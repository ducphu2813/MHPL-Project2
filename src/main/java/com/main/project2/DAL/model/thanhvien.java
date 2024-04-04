package com.main.project2.DAL.model;

import jakarta.persistence.*;

import java.util.Set;
import lombok.*;

@Entity
@Table(name = "thanhvien")
@Getter
@Setter
@NoArgsConstructor
public class thanhvien {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "ten")
	private String ten;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_khoa")
	private khoa khoa;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_nganh")
	private nganh nganh;
	
	@Column(name = "sodienthoai")
	private String sodienthoai;
	
	@OneToMany(
			mappedBy = "thanhvien",
			fetch = FetchType.LAZY,
			cascade = CascadeType.REMOVE)
	private Set<xuly> xuly;

	@OneToMany(
			mappedBy = "thanhvien",
			fetch = FetchType.LAZY,
			cascade = CascadeType.REMOVE)
	private Set<thongtin_vao> thongtinvaos;

	@OneToMany(
			mappedBy = "thanhvien",
			fetch = FetchType.LAZY,
			cascade = CascadeType.REMOVE)
	private Set<thongtin_sudung> sudungs;

	@Override
	public String toString() {
		return "thanhvien{" +
				"id=" + id +
				", ten='" + ten + '\'' +
				", khoa=" + khoa +
				", nganh=" + nganh +
				", sodienthoai='" + sodienthoai + '\'' +
				'}';
	}
}
