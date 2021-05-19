/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.controller;

import jp.co.solxyz.jsn.springsecuritysample.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
  @GetMapping
  public ModelAndView initilize() {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("loginForm", new LoginForm());
    return mav;
  }
}
