package com.project.laith.seveis;


import com.project.laith.models.client;
import com.project.laith.repostry.clientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class client_servers1 {

@Autowired
clientInterface n;
    public client Insert_client (String name){
        client Client_project = new client();
        Client_project.setName(name);





        ;
    n.save(Client_project);
    return Client_project;

}

public
ResponseEntity
GetUser(Integer id){
      //  client c=new client();
    Optional<client> result
            =n.findById(id);
    if(result.isPresent()){return  ResponseEntity.ok(result.get());
    }return ResponseEntity.ok(new client());
}
public void Daulat_User(Integer id){
    n.deleteById(id);

}







    }



