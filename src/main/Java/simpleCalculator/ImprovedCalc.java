package simpleCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ImprovedCalc" ,urlPatterns = {"/ImprovedCalculator"})
public class ImprovedCalc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<form action=\"ImprovedCalculator\" method=\"post\">");
        pw.println("<h1>Welcome to CS472 Web Programming</h1>");
        String val1 = request.getParameter("val1");
        String val2 = request.getParameter("val2");
        String val3 = request.getParameter("val3");
        String val4 = request.getParameter("val4");

        String sum = "", product = "";
        if(!val1.equals("") && !val2.equals("")) {
            Integer x = (Integer.parseInt(val1) + Integer.parseInt(val2));
            sum = x.toString();

            pw.println("<p><input type=\"text\" name=\"val1\" pattern=\"[0-9]\" value=" + val1 + "> +");
            pw.println("<input type=\"text\" name=\"val2\" pattern=\"[0-9]\" value = "+val2+"> =");
            pw.println("<input type=\"text\" name=\"sum\" value = " +sum +" readonly> </p>");
        }
        else
        {
            pw.println("<p><input type=\"text\" name=\"val1\" pattern=\"[0-9]\"> +");
            pw.println("<input type=\"text\" name=\"val2\" pattern=\"[0-9]\"> =");
            pw.println("<input type=\"text\" name=\"sum\" readonly> </p>");
        }

        if(!val3.equals("") && !val4.equals("")) {
            Integer y = (Integer.parseInt(val3) * Integer.parseInt(val4));
            product = y.toString();
            pw.println("<p><input type=\"text\" name=\"val3\" pattern=\"[0-9]\" value=" + val3 + "> *");
            pw.println("<input type=\"text\" name=\"val4\" pattern=\"[0-9]\" value=" + val4 + "> =");
            pw.println("<input type=\"text\" name=\"product\" value=" + product + " readonly></p>");
        }
        else
        {
            pw.println("<p><input type=\"text\" name=\"val3\" pattern=\"[0-9]\"> *");
            pw.println("<input type=\"text\" name=\"val4\" pattern=\"[0-9]\" > =");
            pw.println("<input type=\"text\" name=\"product\" readonly></p>");
        }

        pw.println("<p><input type=\"submit\"/></p>");
        pw.println("</form>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
