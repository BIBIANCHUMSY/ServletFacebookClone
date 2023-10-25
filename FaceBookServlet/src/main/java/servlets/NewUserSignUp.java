package servlets;

import entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.FacebookRepo;
import services.serviceImplementation.UserServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

public class NewUserSignUp extends HttpServlet {

    private String successMessage;
    private String failureMessage;
    private UserServiceImpl signUpServices;

    public void init() {
        failureMessage = "Incorrect Login details";
        successMessage = "You are logged in";
        // Create the dependencies
        FacebookRepo facebookRepo = new FacebookRepo();
        signUpServices = new UserServiceImpl(facebookRepo);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Retrieve form data from request
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        // Create a new User object with the form data
        User user = new User();
        user.setUserMail(email);
        user.setPassWord(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDob("12-02-2012");
        user.setGender("female");
        user.setTimeStamp("11:00:03");

        System.out.println(user);

        // Call signUpServices to sign up the user
        String result = signUpServices.signUp(user);
        System.out.println(result);

        PrintWriter out = resp.getWriter();

        if (result.equals("Data Added")) {
            // Display success message and redirect to sign-in page
            out.println("<html><body><h1>" + successMessage + " " + user.getFirstName() + "</h1></body></html>");
            resp.sendRedirect("signIn.jsp");
        } else {
            // Display failure message and redirect to sign-in page
            out.println("<html><body><h1>" + failureMessage + " " + user.getFirstName() + "</h1></body></html>");
//            resp.sendRedirect("signIn.jsp");
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}

