
package models;

import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateo Santarsiero
 */
public class ClientDao implements Dao<Client> {
    private final List<Client> clients = new ArrayList<>();
     
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
            if (c.getID() == oldClient.getID()) {
                clients.add(clients.indexOf(c), newClient);
            }
        }
    }

    @Override
    public void delete(Client c) {
        clients.remove(c);
    }
    
}
