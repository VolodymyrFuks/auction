//package servise;
//
//import bl.Util;
//import dao.UserDao;
//import entities.User;
//
//import java.security.Permission;
//import java.security.SecureRandom;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserServise extends Util {
//    Connection connection = getConnection();
//
//    public void add(User user) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        String sgl = "INSERT iNTO ADDRES(ID, USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME) VALUES(?, ?, ?, ?, ?, ?)";
//        try {
//            preparedStatement.setLong(1, user.getId());
//            preparedStatement.setString(2, user.getUserName());
//            preparedStatement.setString(3, user.getPassword());
//            preparedStatement.setString(4, user.geteMail());
//            preparedStatement.setString(5, user.getFirstName());
//            preparedStatement.setString(6, user.getLastName());
//
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null)
//                preparedStatement.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//
//    }
//
//    public List<User> getAll() throws SQLException {
//        List<User> userList = new ArrayList<User>();
//        String sgl = "SELECT ID, USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME FROM USER";
//        Statement statement = null;
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sgl);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setUserName(resultSet.getString("USERNAME"));
//                user.setPassword(resultSet.getString("PASSWORD"));
//                user.seteMail(resultSet.getString("EMAIL"));
//                user.setFirstName(resultSet.getString("FIRSTNAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (statement != null)
//                statement.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//        return userList;
//    }
//
//    public User getById(Long id) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        String sql = "SELECT ID, USERNAME, PASSWORD, EMAIL, FIRSTNAME, LASTNAME FROM USER WHERE ID=?";
//
//        User user = new User();
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setLong(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            user.setId(resultSet.getLong("ID"));
//            user.setUserName(resultSet.getString("USERNAME"));
//            user.setPassword(resultSet.getString("PASSWORD"));
//            user.seteMail(resultSet.getString("EMAIL"));
//            user.setFirstName(resultSet.getString("FIRSTNAME"));
//            user.setLastName(resultSet.getString("LASTNAME"));
//
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null)
//                preparedStatement.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//        return user;
//    }
//
//    public void update(User user) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        String sql = "UPDATE USER SET USERNAME=?, PASSWORD=?, EMAIL=?, FIRSTNAME=?, LASTNAME=? WHERE ID =? ";
//
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, user.getUserName());
//            preparedStatement.setString(2, user.getPassword());
//            preparedStatement.setString(3, user.geteMail());
//            preparedStatement.setString(4, user.getFirstName());
//            preparedStatement.setString(5, user.getLastName());
//            preparedStatement.setLong(6, user.getId());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null)
//                preparedStatement.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//    }
//
//    public void remove(User user) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        String sql = "DELETE FROM USER WHERE ID=?";
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setLong(1, user.getId());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            if (preparedStatement != null)
//                preparedStatement.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//
//    }
//}
