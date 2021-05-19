/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** トップ画面コントローラークラス */
@Controller
@RequestMapping("/")
public class IndexController {
  /**
   * 初期表示
   *
   * @param user 認証ユーザ情報
   * @return ModelAndView
   */
  @GetMapping
  public ModelAndView initilize(@AuthenticationPrincipal User user) {
    if (user != null) {
      System.out.println("username: " + user.getUsername());
      System.out.println("permission: " + user.getAuthorities().toString());
    }
    return new ModelAndView("index");
  }

  /**
   * ログイン画面遷移ボタン押下時処理
   *
   * @return redirect url
   */
  @PostMapping(params = "login")
  public String clickLoginScreenButton() {
    return "redirect:/login";
  }

  /**
   * プロテクト画面遷移ボタン押下時処理
   *
   * @return redirect url
   */
  @PostMapping(params = "protect")
  public String clickProtectScreenButton() {
    return "redirect:/protect";
  }

  /**
   * 管理者画面遷移ボタン押下時処理
   *
   * @return redirect url
   */
  @PostMapping(params = "admin")
  public String clickAdminScreenButton() {
    return "redirect:/admin";
  }
}
