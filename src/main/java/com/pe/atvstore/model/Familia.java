package com.pe.atvstore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Familia {

    private String catCcodCat;
    private String subCcodSub;
    private String famCcodFam;
    private String famCdesFam;
}
