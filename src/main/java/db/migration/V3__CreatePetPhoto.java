package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kawasima
 */
public class V3__CreatePetPhoto implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE pet_photo("
                    + "id identity primary key,"
                    + "pet_id integer not null, "
                    + "url varchar(255) not null"
                    + ")");
        }
    }
}
