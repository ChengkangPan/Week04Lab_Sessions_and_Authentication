package Servlet;

import domain.AccountService;
import domain.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 832676
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

 
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("Password");
        request.setAttribute("UserName", username);
        request.setAttribute("password", password);
        if (username != null  && password != null) {
            AccountService as = new AccountService();
            User user = as.login(username, password);
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("User", user);
                response.sendRedirect("./home");
            }
                else if (user==null)
                     {
                     request.setAttribute("Message", "Invalid login");
                      getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                     }
            } else {
                request.setAttribute("Message", "Invalid login");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        }
    }

