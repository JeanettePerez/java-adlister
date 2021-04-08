

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/choose-color")
public class ChooseColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");



        String textForm = "";
        textForm += "<h1>What is your favorite color?</h1>";
        textForm += "<form method='POST' action='/choose-color'><br/>";
        textForm += "<input type='text' name='color'/><br/><br/>";
        textForm += "<button>Submit</button>";
        textForm += "</form>";
        out.println(textForm);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String colorChoice = req.getParameter("color");
        resp.sendRedirect("/view-color?color=" + colorChoice);
    }


}
