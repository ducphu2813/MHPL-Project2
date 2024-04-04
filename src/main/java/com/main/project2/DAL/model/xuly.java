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
@Table(name = "xuly")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class xuly {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_thanhvien")
	private thanhvien thanhvien;
	
	@Column(name = "lydo")
	private String lydo;

	@Column(name = "hinhthuc_xl")
	private String hinhthuc_xl;
	
	@Column(name = "tienphat")
	private Double tienphat;

	@Column(name = "songay_ban")
	private Integer songay_ban;
	
	@Column(name = "ngay_xuly")
	private LocalDateTime ngay_xuly = LocalDateTime.now();
	
	@Column(name = "trangthai")
	private boolean trangthai = false;

	public boolean getTrangThai(){
		return this.trangthai;
	}

}
