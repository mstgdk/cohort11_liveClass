package sql;

import java.time.LocalDateTime;

public class Actor {
    Integer actor_id;
    String first_name;
    String last_name;
    LocalDateTime last_update;

    public static void main(String[] args) {
        Actor ac = new Actor();
        ac.actor_id=1;
        ac.first_name="Penelope";
    }
}
