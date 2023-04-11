package com.darkzill.pendaftaranbeckend.Pasien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PasienRepo extends JpaRepository<PasienModel, String> {

    Optional<PasienModel> findByNoPeserta(String noPeserta);

    Optional<PasienModel> findByNoRkmMedis(String noRkmMedis);
}
