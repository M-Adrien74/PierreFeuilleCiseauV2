package fr.adrien.pierrefeuilleciseauv2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {


    Jeu jeu = new Jeu();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/victoire.jsp");
        Choix choixUser = Choix.CISEAU;


        if (request.getParameter("pierre") != null) {
            choixUser = Choix.PIERRE;
        }
        if (request.getParameter("feuille") != null) {
            choixUser = Choix.FEUILLE;
        }
        if (request.getParameter("ciseau") != null) {
            choixUser = Choix.CISEAU;
        }

        Choix choixIa = jeu.choixDuPc();
        jeu.compare(choixUser, choixIa);
        request.setAttribute("score", jeu.getScoreJoueur());
        request.setAttribute("scorePc", jeu.getScorePc());

        if (jeu.getScoreJoueur() == 3) {
            RequestDispatcher rv = request.getRequestDispatcher("WEB-INF/winner.jsp");
            jeu.scoreJoueur = 0;
            jeu.scorePc = 0;
            rv.forward(request, response);

        } else if (jeu.getScorePc() == 3) {
            RequestDispatcher rv = request.getRequestDispatcher("WEB-INF/looser.jsp");
            jeu.scorePc = 0;
            jeu.scoreJoueur = 0;
            rv.forward(request, response);

        }

        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
