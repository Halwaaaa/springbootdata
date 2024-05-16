package com.project.laith.controll;

import com.project.laith.models.client;
import com.project.laith.repostry.clientInterface;

import com.project.laith.seveis.client_servers1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client_control")
public class client_control {
    @Autowired
    client_servers1 clientt;
    @GetMapping("/l")
    public ResponseEntity u(){
        return ResponseEntity.ok("bn");
    }


    @RequestMapping("/insert_client")
    public   ResponseEntity insert_into_client(@RequestParam String name){

        return ResponseEntity.ok(clientt.Insert_client(name));}


    @RequestMapping("/get_clientt")
    private ResponseEntity get_client(@RequestParam Integer id) {


        return ResponseEntity.ok(clientt.GetUser(id));


    }
    @Autowired
    clientInterface n;
    //@Autowired
  //  client _client;

    @GetMapping("/dalalut_client")
    private  ResponseEntity daluat_user(@RequestParam Integer id){
        clientt.Daulat_User(id);
        client h = new client();
        List<client> k=new ArrayList<client>() ;
        k= n.findAll();

        return ResponseEntity.ok(k);
    }
}

