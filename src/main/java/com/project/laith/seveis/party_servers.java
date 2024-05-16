package com.project.laith.seveis;


import com.project.laith.models.partymodels;
import com.project.laith.repostry.party_models_r;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class party_servers {

@Autowired
party_models_r _party_models_er;
    public partymodels Insert_party (String clock, String name, Double price){
       partymodels _partmodels = partymodels.builder()
                .clock(clock).price(price).name(name).build();

        _party_models_er.save(_partmodels);
        return _partmodels ;

    }
    public partymodels updata_party(partymodels _partt){
        partymodels u = new partymodels();
        u=_partt;
        _party_models_er.save(u);
        return  u;
    }
    public   void dalute_party(int id)
    {
        _party_models_er.
                deleteById(id);

    }
    public List<partymodels> get_Allpraty(){
        partymodels i =new partymodels();
        List<partymodels>  result= new ArrayList<partymodels>();
  //  result  =  _party_models_er.findAll();
    return result;
    }

}
