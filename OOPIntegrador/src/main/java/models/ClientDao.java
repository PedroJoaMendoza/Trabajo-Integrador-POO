/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author idra2
 */
public class ClientDao implements Dao<Client> {
    private List<Client> clients = new ArrayList<Client>();
     
    @Override
    public Client Get(long id) {
        for(Client c : clients){
            if (c.getID() == id) {
                return c;
            }
        }
        System.out.println("No se encontro un cliente"); // <-- En la ventana de busqueda, debe mostrarse el error
        return null;
    }

    @Override
    public List<Client> GetAll() {
        return clients;
    }

    @Override
    public void save(Client c) {
        clients.add(c);
    }

    @Override
    public void update(Client oldClient, Client newClient) {
        for(Client c : clients){
            if (oldClient.getID() == newClient.getID()) {
                clients.add(clients.indexOf(c), newClient);
            }
        }
    }

    @Override
    public void delete(Client c) {
        clients.remove(c);
    }
    
}
