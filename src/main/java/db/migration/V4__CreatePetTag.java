package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kawasima
 */
public class V4__CreatePetTag implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE pet_tag("
                    + "pet_id integer not null, "
                    + "tag_id integer not null,"
                    + "primary key(pet_id, tag_id)"
                    + ")");
        }
    }
}
