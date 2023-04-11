package com.darkzill.pendaftaranbeckend.Pasien;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


@Entity
@Transactional
@Getter
@Setter
@ToString
@RequiredArgsConstructor

@AllArgsConstructor
@Table(name = "pasien")
public class PasienModel {
            @Id
            @Column(name = "no_rkm_medis")
            private String noRkmMedis;

            @Column(name = "nm_pasien")
            private String nmPasien;

            @Column(name = "no_ktp")
            private String noKtp;

            @Column(name = "jk")
            private String jk;

            @Column(name = "tmp_lahir")
            private String tmpLahir;

            @Column(name = "tgl_lahir")
            private java.sql.Date tglLahir;

            @Column(name = "nm_ibu")
            private String nmIbu;

            @Column(name = "alamat")
            private String alamat;

            @Column(name = "gol_darah")
            private String golDarah;

            @Column(name = "pekerjaan")
            private String pekerjaan;

            @Column(name = "stts_nikah")
            private String sttsNikah;

            @Column(name = "agama")
            private String agama;

            @Column(name = "tgl_daftar")
            private java.sql.Date tglDaftar;

            @Column(name = "no_tlp")
            private String noTlp;

            @Column(name = "umur")
            private String umur;

            @Column(name = "pnd")
            private String pnd;

            @Column(name = "keluarga")
            private String keluarga;

            @Column(name = "namakeluarga")
            private String namakeluarga;

            @Column(name = "kd_pj")
            private String kdPj;

            @Column(name = "no_peserta")
            private String noPeserta;

            @Column(name = "kd_kel")
            private Integer kdKel;

            @Column(name = "kd_kec")
            private Integer kdKec;

            @Column(name = "kd_kab")
            private Integer kdKab;

            @Column(name = "pekerjaanpj")
            private String pekerjaanpj;

            @Column(name = "alamatpj")
            private String alamatpj;

            @Column(name = "kelurahanpj")
            private String kelurahanpj;

            @Column(name = "kecamatanpj")
            private String kecamatanpj;

            @Column(name = "kabupatenpj")
            private String kabupatenpj;

            @Column(name = "perusahaan_pasien")
            private String perusahaanPasien;

            @Column(name = "suku_bangsa")
            private Integer sukuBangsa;

            @Column(name = "bahasa_pasien")
            private Integer bahasaPasien;

            @Column(name = "cacat_fisik")
            private Integer cacatFisik;

            @Column(name = "email")
            private String email;

            @Column(name = "nip")
            private String nip;

            @Column(name = "kd_prop")
            private Integer kdProp;

            @Column(name = "propinsipj")
            String propinsipj;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PasienModel that = (PasienModel) o;
        return noRkmMedis != null && Objects.equals(noRkmMedis, that.noRkmMedis);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
