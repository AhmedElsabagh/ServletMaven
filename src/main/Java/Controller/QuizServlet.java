package Controller;

import Model.QuizQuestion;
import Model.Quiz;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "QuizServlet" ,urlPatterns = {"/quiz"})
public class QuizServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    //response.setContentType("text/html");

    HttpSession s = request.getSession();

    Quiz quiz = (Quiz) s.getAttribute("quiz");
    if (quiz == null) {
      quiz = new Quiz();
      s.setAttribute("quiz", quiz);
    }

    String ans = request.getParameter("answer");
    if(ans != null && ans != "") {
      QuizQuestion preQuestion = (QuizQuestion) s.getAttribute("ques");
      if(preQuestion != null) {
        preQuestion.setUserAnswer(ans);
        quiz.setQuestionAnswer(preQuestion);
      }
    }

    QuizQuestion qq = quiz.getRandomQuizQuestion();

//    PrintWriter pw = response.getWriter();
//    pw.println("<form action=\"quiz\" method=\"post\">");
//    pw.println("<h1>The Number Quiz</h1>");

    if(qq != null) {
      s.setAttribute("ques", qq);

//      pw.println("Your current score is " + quiz.getScore() + ".");
//      pw.println("<p>Guess the next number in the sequence.</p>");
//      pw.println("<p>" + qq.getQuestion() + "</p>");
//      pw.println("<p>Your answer: <input name=\"answer\"></p>");
//      pw.println("<p><input type=\"submit\" name=\"Submit\"></p>");
      request.getRequestDispatcher("quizServletLab.jsp").forward(request,response);
    }
    else
    {
//      pw.println("Your current score is " + quiz.getScore() + ".");
//      pw.println("<p>You have completed The Number Quiz, with a score " + quiz.getScore() + "out of "+ quiz.getQuizQuestions().size() + ".</p>");

      request.getRequestDispatcher("finishQuizResult.jsp").forward(request,response);
      s.invalidate();
    }


//    pw.println("</form>");
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request,response);
  }
}

