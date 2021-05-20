package ru.job4j.cinema.servlet;

import org.json.JSONObject;
import ru.job4j.cinema.model.Ticket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class HallServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = req.getReader();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } finally {
            reader.close();
        }
        JSONObject reqJson = new JSONObject(sb.toString());

        System.out.println(reqJson.toString());



        System.out.println("HallServlet");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");


        JSONObject jsonHallServlet = new JSONObject();

        switch (req.getServletPath()) {
            case "/all-tickets" :
                jsonHallServlet = getAllTickets();
                break;
            case "/sold-tickets" :
                jsonHallServlet.put("ticket", "sold");
                break;
            case "/booked-tickets" :
                jsonHallServlet.put("ticket", "booked");
                break;
            default:
                jsonHallServlet.put("ticket", "error");
        }




        PrintWriter writer = new PrintWriter(resp.getOutputStream());

        System.out.println(jsonHallServlet.toString());

        writer.println(jsonHallServlet.toString());
        writer.flush();
    }

    private JSONObject getAllTickets() {
        JSONObject json = new JSONObject();
        List<Integer> allTicket = new ArrayList<>();
        allTicket.add(1);
        allTicket.add(2);
        allTicket.add(3);
        allTicket.add(4);

        return json.put("ticket", allTicket);
    }

}
