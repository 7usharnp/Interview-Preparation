package pojos;

import java.util.List;

public class Data {
    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Data{" +
                "users=" + users +
                '}';
    }
}
