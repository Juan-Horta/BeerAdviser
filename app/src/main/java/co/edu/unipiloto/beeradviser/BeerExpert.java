package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("light")) {
            brands.add("Labatt Blue Light Grapefruit");
            brands.add("Corona Premier");
            brands.add("Pabst Blue Ribbon Easy");
        } else if(color.equals("amber")) {
            brands.add("Portland Brewing MacTarnahan's\n");
            brands.add("Four Saints Brewing Potter's Clay\n");
            brands.add("Breakside Brewery Fall Apple Ale\n");
        }else if(color.equals("brown")) {
            brands.add("Sweetwater Georgia");
            brands.add("Founders Sumatra Mountain");
            brands.add("Newcastle Brown Ale");
        }else{
            brands.add("Alaskan Smoked Porter");
            brands.add("Bell's Expedition Stout");
            brands.add("Ayinger Altbairisch");
        }

        return brands;
    }
}