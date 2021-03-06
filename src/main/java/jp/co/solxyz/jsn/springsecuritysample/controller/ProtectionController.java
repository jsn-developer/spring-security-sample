/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** プロテクト画面コントローラークラス */
@Controller
@RequestMapping("/protect")
public class ProtectionController {
  /**
   * 初期表示
   *
   * @return ModelAndView
   */
  @GetMapping
  public ModelAndView initilize() {
    return new ModelAndView("protect");
  }
}
