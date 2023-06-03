package driver.model;

import javax.persistence.*;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_no;

    // navigational properties
    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn
    User user;

    public Connection(int id, ServiceProvider serviceProvider, User user) {
        this.id_no = id;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }

    public Connection() {
    }

    public int getId() {
        return id_no;
    }

    public void setId(int id) {
        this.id_no = id;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}