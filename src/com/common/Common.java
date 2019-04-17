package com.common;

import javax.servlet.http.HttpServletRequest;

public class Common {
	public static String getCmd(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String cmd = request.getParameter("cmd");
		
		if(cmd==null) {
			cmd = uri.substring(uri.lastIndexOf("/")+1);
		}
		return cmd;
	}
}
