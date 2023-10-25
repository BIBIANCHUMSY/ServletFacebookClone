package jdbcConnection;

import entities.User;

import java.sql.*;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/facebook_clone";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "08131054804Chi.";
    private static String CREATE_NEW_USER = "INSERT INTO userData (firstname,lastname,email,password,timestamp,dob,gender) VALUES(?,?,?,?,?,?,?);";
    private static String READ_USER_DATA = "SELECT * FROM userData WHERE email=?;";
    private static String UPDATE_USER_DATA = "UPDATE userData SET firstname=?, lastname=? WHERE email =?;";
    private static String DELETE_USER = "DELETE FROM userData WHERE email=?;";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public String createUser(User user){

        try
        {
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(CREATE_NEW_USER);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUserMail());
            statement.setString(4, user.getPassWord());
            statement.setString(5, user.getTimeStamp());
            statement.setString(6, user.getDob());
            statement.setString(7, user.getGender());

            int rows = statement.executeUpdate();
            if(rows>0){
                return("Data Added");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return "failed";
    }

    public String userLogin(User user){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(READ_USER_DATA);
            statement.setString(1, user.getUserMail());
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                user.setFirstName(result.getString("firstname"));
                user.setLastName(result.getString("lastname"));
                user.setUserMail(result.getString("email"));

                System.out.println("Login successful: " + user.getFirstName() + " "+ user.getLastName().toUpperCase());
            }
            else {
                System.out.println("Login not successful");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return user.getUserMail();
    }

    public static void updateData(User user){

        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(UPDATE_USER_DATA))
        {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUserMail());


            int rows = statement.executeUpdate();

            if(rows>0){
                System.out.println("user data updated");
            }else{
                System.out.println("nothing happened");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteData(User user){

        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(DELETE_USER)){

            statement.setString(1, user.getUserMail());

            int rows = statement.executeUpdate();

            if(rows>0){
                System.out.println("user data deleted");
            }else{
                System.out.println("nothing happened");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        User user2 = new User();

//        FacebookRepo fb = new FacebookRepo();
//        createUser(user1);
//          fb.userLogin(user);
        updateData(user2);
        deleteData(user);
    }
}
