package simulado_q1.twitter;

import java.util.HashSet;
import java.util.Set;

public class UserBase {

  private Set<User> users = new HashSet<>();

  public Set<User> getUsers() {
    return new HashSet<User>(users);
  }

  public void addUser(User u) {
    users.add(u);
  }

}
