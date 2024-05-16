package com.project.laith.seveis;

import com.project.laith.models.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServeisMain {

    public String printnamwe(String name){
        return  name.toLowerCase();
    }
    @Autowired
 private    admin admin ;
    public admin  getDataBase(String name){

admin.setName("cvbnm");
        String result =admin.getSdminTabels()
                .stream().filter(i->i==name).findAny().orElse("noy");
        return admin;
    }
    public List  getList (){
        List<admin> u =new ArrayList<>();
        admin.getSdminTabels().
                stream().forEach(name ->u.add(new admin(name)) );
        return u;

    }


}
