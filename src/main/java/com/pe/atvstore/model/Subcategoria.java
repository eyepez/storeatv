package com.pe.atvstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subcategoria {

    private String catCcodCat;
    private String subCcodSub;
    private String subCdesSub;
}
