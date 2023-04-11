package com.darkzill.pendaftaranbeckend.Pasien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PasienController {

    @Autowired
    PasienService pasienService;


    @RequestMapping(value = "/getPasienModelPage/{pageNumber}/{pageSize}/{sortProperty}", method = RequestMethod.GET)
    public Page<PasienModel> getPasienModelPage (@PathVariable Integer pageNumber,
                                                 @PathVariable Integer pageSize,
                                                 @PathVariable String sortProperty){

        return pasienService.getPasienPage(pageNumber,pageSize,sortProperty);
    }


    @GetMapping("/pasien/noPeserta/{noPeserta}")
    public ResponseEntity<PasienModel> getPasienByNoPeserta(@PathVariable String noPeserta) {
        Optional<PasienModel> pasien = pasienService.getPasienByNoPeserta(noPeserta);
        if (pasien.isPresent()) {
            return ResponseEntity.ok(pasien.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/pasien/noRkmMedis/{noRkmMedis}")
    public ResponseEntity<PasienModel> getPasienByNoRkmMedis(@PathVariable String noRkmMedis) {
        Optional<PasienModel> pasien = pasienService.getPasienByNoRkmMedis(noRkmMedis);
        if (pasien.isPresent()) {
            return ResponseEntity.ok(pasien.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }





}
