package ioc.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    private IService service;

    @Override
    public void init() throws ServletException {
        // Get the IoC container and resolve the service
        IoCContainer container = App.getContainer();
        service = container.resolve(IService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Use the service
        service.performAction("Hello from Servlet!");

        resp.getWriter().write("Action performed, check console for details.");
    }
}
