package com.company;

import com.company.Services.MedziaiGenericMetodai;
import com.company.model.Augalai.*;
import com.company.model.AugaluTipai.Spygliuotis;
import com.company.model.Medziai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pusis pusis1 = new Pusis();
        Pusis pusis2 = new Pusis();
        Pusis pusis3 = new Pusis();
        Azuolas azuol1 = new Azuolas();
        Azuolas azuol2 = new Azuolas();
        Egle egle1 = new Egle();
        Egle egle2 = new Egle();
        Egle egle3 = new Egle();
        Kadagys kad1 = new Kadagys();
        Berzas ber1 = new Berzas();
        Berzas ber2 = new Berzas();
        Berzas ber3 = new Berzas();
        Berzas ber4 = new Berzas();

        List<Medziai> ivMedziai = new ArrayList<>();
        ivMedziai.add(pusis1);
        ivMedziai.add(pusis2);
        ivMedziai.add(pusis3);
        ivMedziai.add(azuol1);
        ivMedziai.add(azuol2);
        ivMedziai.add(egle1);
        ivMedziai.add(ber1);
        ivMedziai.add(ber2);

        List<Spygliuotis> spyglMedziai = new ArrayList<>();
        spyglMedziai.add(pusis1);
        spyglMedziai.add(pusis2);
        spyglMedziai.add(egle1);

        MedziaiGenericMetodai obj = new MedziaiGenericMetodai();
        obj.ivairusMiskas(ivMedziai);
        obj.spygliuociuMiskas(spyglMedziai);
    }
}