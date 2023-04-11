package com.darkzill.pendaftaranbeckend.Pasien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PasienService {

    @Autowired
    private PasienRepo pasienRepo;





    public Page<PasienModel> getPasienPage(Integer pageNumber, Integer pageSize, String sortProperty) {
        Pageable pageable;
        if (null != sortProperty) {
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, sortProperty);
        } else {
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, "tglDaftar");
        }
        return pasienRepo.findAll(pageable);
    }

    public Optional<PasienModel> getPasienByNoPeserta(String noPeserta) {

        return pasienRepo.findByNoPeserta(noPeserta);
    }

    public Optional<PasienModel> getPasienByNoRkmMedis(String noRkmMedis) {
        return  pasienRepo.findByNoRkmMedis(noRkmMedis);
    }
}
