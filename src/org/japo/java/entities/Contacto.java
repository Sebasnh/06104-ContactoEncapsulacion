/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1l;

    public static final String DEF_ALIAS = "Aupatú";

    public static final int DEF_EDAD = 18;

    private String alias;

    private int edad;

    public Contacto() {
        alias = DEF_ALIAS;
        edad = DEF_EDAD;
    }

    public Contacto(String alias, int edad) {
        if (edad < 18) {
            this.edad = DEF_EDAD;
            System.out.println("Usted ed menor de edad. "
               + "No puede realizar su mensaje adjunto al nombre introducido");
        } else {
            this.edad = edad;
        }
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
          if (edad < 18) {
            this.edad = DEF_EDAD;
            System.out.println("");
            System.out.println("Usted es menor de edad. "
               + "No puede realizar su mensaje adjunto al nombre introducido.");
            System.out.println("Asignada edad por defecto");
            System.out.println("");
        } 
    }

}
