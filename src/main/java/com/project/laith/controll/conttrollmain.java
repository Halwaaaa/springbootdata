package com.project.laith.controll;


import com.project.laith.models.admin;
import com.project.laith.seveis.ServeisMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class conttrollmain {


    @Autowired
    ServeisMain serveisMain;
    @Autowired
    admin Admin;
    private com.project.laith.models.admin admin;

    @GetMapping("/m")
    private String printname(@RequestParam String namee) {
        System.out.print("vbnm,.");
        return serveisMain.printnamwe(namee);

    }
@GetMapping("/n")
    private ResponseEntity getdata(){

        return ResponseEntity.ok(serveisMain.getDataBase("mo"));

    }
    @GetMapping("/l")
    private ResponseEntity getList(){
        return ResponseEntity.ok(serveisMain.getList());
    }
    String admin1="";
    @PostMapping("/s")

    public ResponseEntity Sacve (    @RequestBody    admin Admin1){

   // Admin.setName(Admin1.toString());

        return ResponseEntity.ok(Admin1);



    }
}
