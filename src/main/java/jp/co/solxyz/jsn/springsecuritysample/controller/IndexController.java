/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

  @GetMapping
  public ModelAndView initilize(@AuthenticationPrincipal User user) {
    ModelAndView mav = new ModelAndView("index");
    if (user != null) {
      mav.addObject("username", user.getUsername());
      mav.addObject("permission", user.getAuthorities().toString());
    }
    return mav;
  }

  @PostMapping(params = "login")
  public String clickLoginScreenButton() {
    return "redirect:/login";
  }

  @PostMapping(params = "protect")
  public String clickProtectScreenButton() {
    return "redirect:/protect";
  }

  @PostMapping(params = "admin")
  public String clickAdminScreenButton() {
    return "redirect:/admin";
  }
}
