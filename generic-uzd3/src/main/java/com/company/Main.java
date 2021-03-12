package com.company;

import com.company.enums.DnsProvider;
import com.company.model.DnsServer;
import com.company.model.Mapas;

public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> mapas1 = new Mapas<>();
        Mapas<String, String> mapas2 = new Mapas<>();

        mapas1.ideti(DnsProvider.CLOUDFLARE, new DnsServer("194.21.1.2", "1.2.1.1"));
        mapas1.ideti(DnsProvider.GOOGLE, new DnsServer("21.1.5.5", "4.5.6.2"));
        mapas1.ideti(DnsProvider.GMAIL, new DnsServer("1.8.5.5", "4.3.3.0"));
        mapas2.ideti("Vienas", "Kengura");
        mapas2.ideti("Du", "Grizlis");
        mapas2.ideti("Trys", "Sernas");

        System.out.println("Paieskos pagal GOOGLE rezultatas: " + mapas1.gauti(DnsProvider.GOOGLE).toString());
        System.out.println("Paieskos pagal \"Trys\" rezultatas: " + mapas2.gauti("Trys"));

    }
}

