package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    public static Deltager createDeltager(String navn, String adresse, String telefonNummer) {
        Deltager deltager = new Deltager(navn, adresse, telefonNummer);
        Storage.addDeltager(deltager);
        return deltager;
    }

    public static ArrayList<Deltager> getDeltagere() {
        return Storage.getDeltagere();
    }

    public static Firma createFirma(String navn, String telefonNummer) {
        Firma firma = new Firma(telefonNummer, navn);
        Storage.addFirma(firma);
        return firma;
    }

    public static ArrayList<Firma> getFirma() {
        return Storage.getFirma();
    }

    public static Tilmelding createTilmelding(LocalDate ankomstDato, Deltager deltager, LocalDate afrejseDato, boolean foredragsholder, Konference konference) {
        Tilmelding tilmelding = konference.createTilmelding(deltager, ankomstDato, afrejseDato, foredragsholder);
        Storage.addTilmelding(tilmelding);
        return tilmelding;
    }

    public static ArrayList<Tilmelding> getTilmeldinger() {
        return Storage.getTilmeldinger();
    }

    public static Hotel createHotel(String navn, String adresse, int pris, int badTillæg, int wifiTillæg, int morgenmadsTillæg) {
        Hotel hotel = new Hotel(navn, adresse, pris, badTillæg, wifiTillæg, morgenmadsTillæg);
        Storage.addHotel(hotel);
        return hotel;
    }

    public static ArrayList<Hotel> getHoteller() {
        return Storage.getHoteller();
    }

    public static Konference createKonference(String navn, String adresse, LocalDate startDato, LocalDate slutDato) {
        Konference konference = new Konference(navn, adresse, startDato, slutDato);
        Storage.addKonference(konference);
        return konference;
    }

    public static ArrayList<Konference> getKonferencer() {
        return Storage.getKonferencer();
    }

    public static Ledsager createLedsager(String navn, Deltager deltager) {
        if (deltager != null) {
            Ledsager ledsager = deltager.createLedsager(navn);
            Storage.addLedsager(ledsager);
            return ledsager;
        }
        return null;
    }

    public static ArrayList<Ledsager> getLedsagere() {
        return Storage.getLedsagere();
    }

    public static Udflugt createUdflugt(String navn, String adresse, LocalDate dato, int pris) {
        Udflugt udflugt = new Udflugt(navn, adresse, dato, pris);
        Storage.addUdflugt(udflugt);
        return udflugt;
    }

    public static ArrayList<Udflugt> getUdflugter() {
        return Storage.getUdflugter();
    }

}
