package servlets;

import entities.User;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.FacebookRepo;
import services.serviceImplementation.UserServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

public class UserLogin extends HttpServlet {

    private String successMessage;
    private String failureMessage;
    private UserServiceImpl loginServices;

    public void init() {
        failureMessage = "Incorrect Login details";
        successMessage = "You are logged in";

        // Create the dependencies
        FacebookRepo facebookRepo = new FacebookRepo();
        loginServices = new UserServiceImpl(facebookRepo);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userEmail = req.getParameter("userEmail");
        String userPassword = req.getParameter("userPassword");
//        System.out.println(userEmail);

        if (userEmail == null || userEmail.isEmpty() || userPassword == null || userPassword.isEmpty()) {
            PrintWriter out = resp.getWriter();
            out.println("<html><body><h1>Invalid email or password</h1></body></html>");
            resp.sendRedirect("signIn.jsp");
            return;
        }

        User user = new User();
        user.setUserMail(userEmail);
        user.setPassWord(userPassword);

        String result = loginServices.signIn(user);

        PrintWriter out = resp.getWriter();

        if (result != null && result.equals(user.getUserMail())) {
            out.println("<html><body><h1>" + successMessage + " " + user.getFirstName() + "</h1></body></html>");
            resp.sendRedirect("home.jsp");
        } else {
            out.println("<html><body><h1>" + failureMessage + " " + user.getFirstName() + "</h1></body></html>");
            resp.sendRedirect("signIn.jsp");
        }
    }
    public void destroy() {
        // Perform any cleanup or resource releasing operations here, if needed.
    }
}
