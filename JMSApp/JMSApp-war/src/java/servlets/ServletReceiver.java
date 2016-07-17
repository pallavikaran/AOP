/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletReceiver extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            InitialContext   ctx = new InitialContext();
                          
                QueueConnectionFactory factory=(QueueConnectionFactory) ctx.lookup("jms/myfactory");
                Queue queue=(Queue) ctx.lookup("myqueue");
                QueueConnection conn=factory.createQueueConnection();
                QueueSession session=conn.createQueueSession(false,QueueSession.AUTO_ACKNOWLEDGE);
                //false in above line imessage is non transactional. means if while receive if any exception occur message will not go to again in queue.
                QueueReceiver receiver= session.createReceiver(queue);
                conn.start();
                for (int i = 1; i <=5; i++) {
                Message msg=receiver.receive();   //  Message msg=receiver.receiveNoWait();
                if(msg!=null)
                {
                    TextMessage txtmsg=(TextMessage)msg;
                    out.print(txtmsg.getText());
                    System.out.println(txtmsg.getText());
                }
                else
                { out.print("No Message received");
                    System.out.println("No more messages available");
                }
                
            }
            
        } catch (Exception ex) {
                Logger.getLogger(ServletReceiver.class.getName()).log(Level.SEVERE, null, ex);
            } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
