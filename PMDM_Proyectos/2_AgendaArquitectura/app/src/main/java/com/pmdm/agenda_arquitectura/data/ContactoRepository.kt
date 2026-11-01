package com.pmdm.agenda_arquitectura.data

import com.pmdm.agenda_arquitectura.data.mocks.ContactoDaoMock
import com.pmdm.agenda_arquitectura.models.Contacto

class ContactoRepository {

    private var dao = ContactoDaoMock()

    fun get(): MutableList<Contacto> = dao.get().toContactos()
    fun get(id: Int): Contacto? = dao.get(id)?.toContacto()
    fun insert(contacto: Contacto) = dao.get().add(contacto.toContactoMock())
}