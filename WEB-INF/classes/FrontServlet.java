package ETU1863.framework.servlet;
import java.io.*;
import java.util.HashMap;

import javax.servlet.*;
import javax.servlet.http.*;

import ETU1863.framework.Mapping;
import url.Utilitaire;
/**
 * FrontServlet
 */
public class FrontServlet
extends HttpServlet {
    HashMap<String, Mapping> mappingUrls;

    public HashMap<String, Mapping> getMappingUrls() {
        return mappingUrls;
    }

    public void setMappingUrls(HashMap<String, Mapping> mappingUrls) {
        this.mappingUrls = mappingUrls;
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String queryString = request.getQueryString();
        PrintWriter pr=response.getWriter();
        StringBuffer requestURL = request.getRequestURL();
        Utilitaire util=new Utilitaire(queryString, requestURL);
        pr.println("Chaine de requete : " + util.getUrlGet());
        pr.println("URL de la requête : " + util.getQueryString());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        processRequest(request, response);
    }
}