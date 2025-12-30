package com.tarunsai.service;

import javax.servlet.http.HttpServletRequest;

import com.tarunsai.entities.Login;

public interface ILoginService {
	public Login signIn(Login login);

	public Login signOut(Login login);

	public boolean checkSession(HttpServletRequest request);

}
