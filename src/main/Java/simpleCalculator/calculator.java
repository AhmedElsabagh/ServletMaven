package simpleCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator",urlPatterns = {"/Calculator"})
public class calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        String val1 = request.getParameter("val1");
        String val2 = request.getParameter("val2");
        String val3 = request.getParameter("val3");
        String val4 = request.getParameter("val4");

        String sum = "", product = "";
        if(!val1.equals("") && !val2.equals("")) {
            Integer x = (Integer.parseInt(val1) + Integer.parseInt(val2));
            sum = x.toString();
            pw.println(val1 + " + " + val2 + " = " + sum);
        }

        if(!val3.equals("") && !val4.equals("")) {
            Integer y = (Integer.parseInt(val3) * Integer.parseInt(val4));
            product = y.toString();
            pw.println(val3 + " * " + val4 + " = " + product);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
