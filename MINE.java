import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MINE extends HttpServlet {

public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        
        int sum=1;
		
        out.print("<html><body><table>");

           while (sum<=1000) { 
        	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            out.print("<tr><td>");
            out.print(sum);   
            out.print("</td></tr>");

        } 


        out.print("</table></body></html>");
  }
}