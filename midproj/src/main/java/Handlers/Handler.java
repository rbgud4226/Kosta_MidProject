package Handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
  String process(HttpServletRequest request, HttpServletResponse response);

}
