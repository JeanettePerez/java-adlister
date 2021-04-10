import userInfo.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/contacts")
public class ViewContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Contact> contacts = new ArrayList<>(Arrays.asList(
                new Contact(1,"Tina Belcher","jmp@gmail.com","(111) 222 3333",true),
                new Contact(2, "Bob Belcher", "jss@gmail.com", "(222) 333 4444", false),
                new Contact(3,"billie bob","bbb@gmail.com", "(333) 444 5555",true),
                new Contact(4,"Amy Pond","amp@gmail.com","(456) 765 1234",false),
                new Contact(5,"Clara Oswald", "coo@gmail.com","(968) 256 0386",true)
        ));
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("contacts.jsp").forward(req,resp); // send the contacts.jsp give it the info from the req and then evaluated to the final html
    }
}
