package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kawasima
 */
public class V1__CreatePet implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE pet("
                    + "id identity primary key, "
                    + "name varchar(255), "
                    + "category_id integer, "
                    + "status varchar(3)"
                    + ")");
        }
    }
}
