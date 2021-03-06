package com.bitacademy.mysite.mvc.user;

import com.bitacademy.mysite.mvc.main.MainAction;
import com.bitacademy.web.mvc.Action;
import com.bitacademy.web.mvc.ActionFactory;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("joinform".equals(actionName)) {
			action = new JoinFormAction();
		}else if("join".equals(actionName)) {
			action = new JoinAction();
		}else if("JoinSuccessAction".equals(actionName)) {
			action = new JoinSuccessAction();
		}else if("loginform".equals(actionName)){
			action = new LoginformAction();
		}else {
			action = new MainAction();
		}
		  
		return action;
	}

}
