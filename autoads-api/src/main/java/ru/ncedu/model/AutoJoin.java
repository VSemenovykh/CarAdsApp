package ru.ncedu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoJoin {

    private Long id;

    private Long idPicture;

    private byte[] raster;

    private String nameBrand;

    private String nameModel;

    private String year;

    private String color;

    private Double price;

    private String motorType;

    private Double volume;

    private String driveType;

    private String transmissionType;

    private String bodyStyleType;
}