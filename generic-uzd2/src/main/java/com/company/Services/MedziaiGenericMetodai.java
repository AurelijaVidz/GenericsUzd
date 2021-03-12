package com.company.Services;

import com.company.model.Augalai.Berzas;
import com.company.model.AugaluTipai.Spygliuotis;
import com.company.model.Medziai;

import java.util.List;

public class MedziaiGenericMetodai {

    public void ivairusMiskas(List<? extends Medziai> med) {
        System.out.println("\nIvairus miskas:");
        for (Medziai m : med)
            System.out.println(m.toString());
    }

    public void spygliuociuMiskas(List<? extends Spygliuotis> medS) {
        System.out.println("\nSpygliuociu miskas:");
        for (Spygliuotis m : medS)
            System.out.println(m.toString());
    }

    void berzuMiskas(List<? extends Berzas> medB) {
        System.out.println("\nBerzu miskas:");
        for (Berzas m : medB)
            System.out.println(m.toString());
    }
}
