package com.proyectoEma.dao;
import java.util.List;

import com.proyectoEma.models.Cliente;

import jakarta.transaction.Transactional;

@Transactional
public interface ClienteDao {
List<Cliente> obtenerClientes();
}
