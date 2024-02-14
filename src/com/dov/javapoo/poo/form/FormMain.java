package com.dov.javapoo.poo.form;

import java.util.ArrayList;

public class FormMain {

    public static void main(String[] args) {
        ArrayList<Form> forms = new ArrayList<>();
        forms.add(new Cercle("rouge", 12));
        forms.add(new Rectangle("blanc", 12, 2));
        forms.add(new Rectangle("bleu", 5, 2));
        forms.forEach(form -> System.out.println(form.getPerimeter()));
    }
}
