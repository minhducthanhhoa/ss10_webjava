package com.data.sesson10_webjava.repository;
import com.data.sesson10_webjava.utils.DBConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
public class DocumentRepository {
    public static void save(String title, String description, String filePath) throws Exception {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO documents (title, description, file_path) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, filePath);
        ps.executeUpdate();
        conn.close();
    }
}
