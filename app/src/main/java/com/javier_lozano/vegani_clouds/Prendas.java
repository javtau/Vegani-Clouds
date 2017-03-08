package com.javier_lozano.vegani_clouds;

import java.util.ArrayList;

/**
 * Created by javi0 on 08/03/2017.
 */

public class Prendas {

    private ArrayList<Prenda> prendas;

    public Prendas() {
        this.prendas = new ArrayList<>();
        this.prendas.add(new Prenda("VESTIDO LACOM","Derivado de algodon tailandes","325€","http://veganiclothes.weebly.com/uploads/1/0/0/6/100678812/s748232947778948572_p8_i1_w2048.jpeg","http://veganiclothes.weebly.com/store/p8/Vestilo_Lacom.html"));
        this.prendas.add(new Prenda("GABARDINA"," ","330€","http://veganiclothes.weebly.com/uploads/1/0/0/6/100678812/s748232947778948572_p9_i1_w2394.jpeg","http://veganiclothes.weebly.com/store/p9/Gabardina.html"));
    }

    public ArrayList<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }
}
