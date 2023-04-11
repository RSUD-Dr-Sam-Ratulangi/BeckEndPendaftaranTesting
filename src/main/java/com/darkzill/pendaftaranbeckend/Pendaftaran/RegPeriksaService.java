package com.darkzill.pendaftaranbeckend.Pendaftaran;


import com.darkzill.pendaftaranbeckend.Pasien.PasienModel;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegPeriksaService {
    @Autowired
    RegPeriksaRepo regPeriksaRepo;


    public Page<RegPeriksaModel> regPeriksaPage(Integer pageNumber, Integer pageSize, String sortProperty) {


            Pageable pageable;
            if (null != sortProperty) {
                pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, sortProperty);
            } else {
                pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, "tglRegistrasi");
            }
            return regPeriksaRepo.findAll(pageable);


    }
}
