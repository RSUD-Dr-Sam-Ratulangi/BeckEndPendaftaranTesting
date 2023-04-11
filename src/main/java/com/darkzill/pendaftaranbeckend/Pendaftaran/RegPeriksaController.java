package com.darkzill.pendaftaranbeckend.Pendaftaran;


import com.darkzill.pendaftaranbeckend.Pasien.PasienModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/RegPeriksa/")
public class RegPeriksaController {

    @Autowired
    RegPeriksaService regPeriksaService;

    @RequestMapping(value = "/getRegPeriksaModelPage/{pageNumber}/{pageSize}/{sortProperty}", method = RequestMethod.GET)
    public Page<RegPeriksaModel> regPeriksaModelPage  (@PathVariable Integer pageNumber,
                                                 @PathVariable Integer pageSize,
                                                 @PathVariable String sortProperty){

        return  regPeriksaService.regPeriksaPage(pageNumber,pageSize,sortProperty);
    }



}
