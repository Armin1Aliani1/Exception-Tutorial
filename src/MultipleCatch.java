import java.io.IOException;
import java.sql.SQLException;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            a();
        } catch (SQLException | IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }

    static void a() throws SQLException, IOException, InterruptedException {

    }
}
