package Run;

import java.sql.*;

public class Database {
    Connection conn;

    public void runDb() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            //System.out.println("Opened database successfully");

        } catch (SQLException | ClassNotFoundException e ) {
            e.printStackTrace();
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

    }

    public void close(){
        if(conn != null)
        {
            try
            {
                conn.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

    /*public String displayDatabase(String tableName) throws SQLException
    {
        String selectSQL = "SELECT * from " +tableName;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQL);

        //System.out.println("---------" + tableName + "-----------");
        System.out.println("Database " +tableName+ " opened succesfully!");
        String a = "";
        while(rs.next())
        {
            a += rs.getString("operation") + "\n";
        }
        return a;
    }*/

    /*public void insertOperation(String operation) throws SQLException
    {
        String insertSQL = "INSERT INTO Operations(operation) VALUES(?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        pstmt.setString(1, operation);
        System.out.println(pstmt);
        pstmt.executeUpdate();
    }*/

    /*public void createTable() throws SQLException
    {
        String createTablesql = "" + "CREATE TABLE Operations " +
                "( " + "operation varchar(255) " + "); " + "";
        Statement stmt = conn.createStatement();
        stmt.execute(createTablesql);

    }*/

    public void createTable() throws SQLException {
        String createTablesql = "CREATE TABLE Operations " +
                "( " +
                "id INTEGER PRIMARY KEY, " +
                "operation VARCHAR(255), " +
                "report TEXT " +
                ");";

        Statement stmt = conn.createStatement();
        stmt.execute(createTablesql);
    }

    public void insertOperation(String operation, String report) throws SQLException {
        String insertSQL = "INSERT INTO Operations(operation, report) VALUES(?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        pstmt.setString(1, operation);
        pstmt.setString(2, report);
        System.out.println(pstmt);
        pstmt.executeUpdate();
    }

    public String displayDatabase(String tableName) throws SQLException {
        String selectSQL = "SELECT id, operation, report FROM " + tableName;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQL);

        System.out.println("Database " + tableName + " opened successfully!");
        String output = "";
        while (rs.next()) {
            int id = rs.getInt("id");
            String operation = rs.getString("operation");
            String report = rs.getString("report");
            output +=operation + "\n";
        }
        return output;
    }

    public String getReportById(int id) throws SQLException {
        String selectSQL = "SELECT report FROM Operations WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(selectSQL);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        String report = null;
        if (rs.next()) {
            report = rs.getString("report");
        }
        return report;

    }

    //----------------------------------------------

    public void deleteTable(Connection conn) throws SQLException
    {
        String deleteTableSQL = "DROP TABLE Operations";
        Statement stmt = conn.createStatement();
        stmt.execute(deleteTableSQL);

    }

    public void clearTable() throws SQLException
    {
        Statement stmt = conn.createStatement();
        String clearTable = "DELETE FROM Operations";
        stmt.execute(clearTable);
        System.out.println("Table has been cleared !");
    }

    public void resetAutoIncrement() throws SQLException {
        // Tablonun adını ve auto increment sütununun adını belirtin
        String autoIncrementColumnName = "id";

        // sqlite_sequence tablosundan auto increment değerini sıfırla
        String resetSql = "DELETE FROM sqlite_sequence WHERE name = 'Operations'";
        PreparedStatement resetStmt = conn.prepareStatement(resetSql);
        resetStmt.executeUpdate();

        // Tablonun auto increment sütununu sıfırla
        String updateSql = "UPDATE Operations SET " + autoIncrementColumnName + " = 0";
        PreparedStatement updateStmt = conn.prepareStatement(updateSql);
        updateStmt.executeUpdate();
    }


}
