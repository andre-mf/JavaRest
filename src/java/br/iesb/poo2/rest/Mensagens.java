package br.iesb.poo2.rest;

import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("msg")
public class Mensagens {
    
    Date tempo = new Date();
    @Path("teste01")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doTeste01(@QueryParam("rest") int a, @QueryParam("xp") int b) {
        return "Resposta em txt RESTFUll, " + a + " O tempo agora é "+ tempo + "b = " + b;
    }
    
    @Path("teste02")
    @GET
    @Produces(MediaType.TEXT_XML)
    public String doTeste02() {
        return "<?xml version=\"1.0\"?>" + "<hello> Formato xml" +tempo+ "</hello>";       
    }
    
    @Path("teste03")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String doTeste03() {
        return "<html> " + "<title>" + "Formato HTML" + "</title>"  
        + "<body><h1>" + "Mensagem em  HTML" + "</h1></body>" +tempo+"</html> ";       
    }
    
    @Path("teste04")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_PLAIN})
    public String doTeste04() {
        return "TEMPO=" + tempo;       
    }
}