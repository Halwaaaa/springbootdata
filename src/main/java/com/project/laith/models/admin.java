package com.project.laith.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class admin {
    @JsonProperty("na")
    private String name;
    List<String> adminn= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public admin(String name
    ) {
        this.name = name;
    }

    public admin() {
        adminn.add("ahmad");
        adminn.add("laith");
        adminn.add("mohamdd");
       adminn.add("ghjkl;");
   }


    public  List<String> getSdminTabels(){
        return adminn;


    }
}
