/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.form;

import lombok.Data;

/** ログインフォームクラス */
@Data
public class LoginForm {
  /** ユーザネーム */
  private String username;

  /** パスワード */
  private String password;
}
