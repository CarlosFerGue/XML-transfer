package Model;

import jakarta.xml.bind.JAXBContext;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import java.util.List;

public class UserList {
    private List<User> users;

    public UserList() {

    }


    public UserList(List<User> users) {
        this.users = users;
    }

    @XmlElement(name = "user")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
