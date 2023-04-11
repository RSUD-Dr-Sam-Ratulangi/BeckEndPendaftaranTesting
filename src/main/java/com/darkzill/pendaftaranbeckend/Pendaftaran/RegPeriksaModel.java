package com.darkzill.pendaftaranbeckend.Pendaftaran;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;


@Entity
@Transactional
@Getter
@Setter
@ToString
@RequiredArgsConstructor

@AllArgsConstructor
@Table(name = "reg_periksa")
public class RegPeriksaModel {
    @Column(name = "no_reg")
    private String noReg;

    @Id
    @Column(name = "no_rawat")
    private String noRawat;

    @Column(name = "tgl_registrasi")
    private java.sql.Date tglRegistrasi;

    @Column(name = "jam_reg")
    private String jamReg;

    @Column(name = "kd_dokter")
    private String kdDokter;

    @Column(name = "no_rkm_medis")
        private String noRkmMedis;

    @Column(name = "kd_poli")
    private String kdPoli;

    @Column(name = "p_jawab")
    private String pJawab;

    @Column(name = "almt_pj")
    private String almtPj;

    @Column(name = "hubunganpj")
    private String hubunganpj;

    @Column(name = "biaya_reg")
    private Double biayaReg;

    @Column(name = "stts")
    private String stts;

    @Column(name = "stts_daftar")
    private String sttsDaftar;

    @Column(name = "status_lanjut")
    private String statusLanjut;

    @Column(name = "kd_pj")
    private String kdPj;

    @Column(name = "umurdaftar")
    private Integer umurdaftar;

    @Column(name = "sttsumur")
    private String sttsumur;

    @Column(name = "status_bayar")
    private String statusBayar;

    @Column(name = "status_poli")
    private String statusPoli;


}
