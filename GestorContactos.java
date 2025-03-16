package com.ejemplo.servicios;

import com.ejemplo.modelo.Contacto;
import java.util.ArrayList;
import java.util.List;

public class GestorContactos {
    private List<Contacto> contactos;

    public GestorContactos() {
        contactos = new ArrayList<>();
    }

    public boolean agregarContacto(Contacto contacto) {
        return contactos.add(contacto);
    }

    public Contacto buscarContacto(int id) {
        for (Contacto contacto : contactos) {
            if (contacto.getId() == id) {
                return contacto;
            }
        }
        return null;
    }

    public boolean eliminarContacto(int id) {
        Contacto contacto = buscarContacto(id);
        if (contacto != null) {
            return contactos.remove(contacto);
        }
        return false;
    }

    public List<Contacto> obtenerContactos() {
        return contactos;
    }
}
