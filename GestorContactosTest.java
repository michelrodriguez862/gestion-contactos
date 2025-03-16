package com.ejemplo.test;

import com.ejemplo.modelo.Contacto;
import com.ejemplo.servicios.GestorContactos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorContactosTest {

    private GestorContactos gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorContactos();
    }

    @Test
    void testAgregarContacto() {
        Contacto contacto = new Contacto(1, "Juan", "juan@correo.com", 25);
        assertTrue(gestor.agregarContacto(contacto));
    }

    @Test
    void testBuscarContacto() {
        Contacto contacto = new Contacto(1, "Juan", "juan@correo.com", 25);
        gestor.agregarContacto(contacto);
        Contacto encontrado = gestor.buscarContacto(1);
        assertNotNull(encontrado);
        assertEquals("Juan", encontrado.getNombre());
    }

    @Test
    void testEliminarContacto() {
        Contacto contacto = new Contacto(1, "Juan", "juan@correo.com", 25);
        gestor.agregarContacto(contacto);
        assertTrue(gestor.eliminarContacto(1));
        assertNull(gestor.buscarContacto(1));
    }
}
