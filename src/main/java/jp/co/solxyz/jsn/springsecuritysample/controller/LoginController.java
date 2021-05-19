/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.controller;

import jp.co.solxyz.jsn.springsecuritysample.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** ログイン画面コントローラークラス */
@Controller
@RequestMapping("/login")
public class LoginController {
  /**
   * 初期表示
   *
   * @return ModelAndView
   */
  @GetMapping
  public ModelAndView initilize() {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("loginForm", new LoginForm());
    return mav;
  }
}
