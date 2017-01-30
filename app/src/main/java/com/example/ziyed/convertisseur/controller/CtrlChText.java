package com.example.ziyed.convertisseur.controller;

import com.example.ziyed.convertisseur.model.ModelChText;
import com.example.ziyed.convertisseur.view.VueChText;

/**
 * Created by zna on 26/01/2017.
 */

public class CtrlChText {

    private ModelChText mod;
    private VueChText vue;

    /**
     * private IEtatChText etatCourant;
     * private IEtatChText etNonEditable = new EtatNonEditable(this);
     * private IEtatChText etEditable = new EtatEditable(this);
     * private IEtatChText etEditableVide = new EtatEditableVide(this);
     */
    public CtrlChText(final ModelChText m) {
        mod = m;
        this.vue = m.getVue();
    }

    public VueChText getVue() {
        return vue;
    }

    public void actionTouche(String s) {

    }

    public void editable() {

    }

    public void nonEditable() {

    }

    public void champVide() {

    }

    public ModelChText getModel() {
        return mod;
    }


    public void convertToDollar() {
        mod.setDollar(vue.getEditText1().getText().toString());
    }

    public void convertToEuro() {

        mod.setEuro(vue.getEditText1().getText().toString());
    }

    public void effacerLesDeuxChamps() {
        mod.effecerLesCh();
    }

    public void setEuroDollar() {
        vue.getTextView2().setText("EURO :");
        vue.getTextView1().setText("DOLLAR :");
    }

    public void setDollarEuro() {
        vue.getTextView2().setText("DOLLAR :");
        vue.getTextView1().setText("EURO :");
    }
}
