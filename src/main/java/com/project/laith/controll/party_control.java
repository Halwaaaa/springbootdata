package com.project.laith.controll;

import com.project.laith.models.partymodels;
import com.project.laith.seveis.party_servers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

;

@Controller
@RequestMapping("/party_contr")
public class party_control {
    @Autowired
    party_servers _party_servers;

    @GetMapping("/insert_party")
    public ResponseEntity insert_party(@RequestParam String name, @RequestParam String clock, @RequestParam double peice) {
        return ResponseEntity.ok(_party_servers.Insert_party(clock, name, peice));
    }



    @PostMapping("/updata_party")
    public ResponseEntity updata_party(@RequestBody partymodels _partymodels) {

      partymodels  o = new partymodels();

        o = _partymodels;

        return ResponseEntity.ok(_party_servers.updata_party(o));


    }

    @GetMapping("/dalate1")
    public  ResponseEntity dalat(@RequestParam int n)
    {

     //   _party_models_er.
       //         deleteById(id);
        _party_servers.dalute_party(n);
        return ResponseEntity.ok(n);
    }


    @GetMapping("/get_Allpar")
    public  ResponseEntity get_Allpaety(){
        String u ="nm,";
        return ResponseEntity.ok(u);
            //    ResponseEntity.ok( _party_servers.get_Allpraty());

    }

}
